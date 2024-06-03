BUILD_DIR = build
DATABASE_DATA_DIR = database/data
CONTAINER_NAME = pfp-operations-api$

clean:
	@echo "Cleaning directories... ($(BUILD_DIR) $(DATABASE_DATA_DIR))"
	@rm -rf $(BUILD_DIR) $(DATABASE_DATA_DIR)

remove-pfp-images:
	@echo "Removing PFP images..."
	@docker images --filter "reference=pfp-*" -q | xargs -r docker rmi -f

down:
	@echo "Removing containers brought up with docker-compose..."
	@docker-compose down

stop: down

build-api: clean
	@echo "Building API (./gradlew build)..."
	@./gradlew build

run-api:
	@echo "Running ./gradlew bootRun..."
	@./gradlew bootRun

up: down clean remove-pfp-images build-api
	@echo "Bringing up all services with docker-compose..."
	@docker-compose up -d

up-without-api: down
	@echo "Bringing up all services with docker-compose except the API..."
	@docker-compose up operations-api-database pgadmin -d

default-run: down clean up-without-api run-api

realtime-api-logs:
	@CONTAINER_ID=$$(docker ps -a -q --filter "name=$(CONTAINER_NAME)" | head -n 1) && \
	if [ -n "$$CONTAINER_ID" ]; then \
		echo "Container ID: $$CONTAINER_ID"; \
		docker logs -f $$CONTAINER_ID; \
	else \
		echo "No container found with the name $(CONTAINER_NAME)"; \
	fi
