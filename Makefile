up:
	@docker-compose up -d

down:
	@docker-compose down

build-image:
	@docker build -t pfp-operations-api .

run-image:
	@docker run -p 4321:8080 --name pfp-operations-api pfp-operations-api

remove-images:
	@docker images --filter "reference=pfp-*" -q | xargs -r docker rmi -f

remove-containers:
	@docker ps -a --filter "name=pfp-*" -q | xargs -r docker rm -f
