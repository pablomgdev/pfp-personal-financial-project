build-image:
	@docker build -t pfp-operations-api .

run-image:
	@docker run -p 4321:8080 --name pfp-operations-api pfp-operations-api

remove-images:
	@docker images | grep "pfp-operations-api" | awk '{print $3}' | xargs -r docker rmi

remove-containers:
	@docker ps -a | grep "pfp-operations-api" | awk '{print $1}' | xargs -r docker rm
