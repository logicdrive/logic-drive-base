# 현재 디렉토리에서 생성된 이미지로 컨테이너 생성

DOCKER_USER_NAME=`cat ./commands/docker/values/docker_user_name.txt`
DOCKER_IMAGE_NAME=`cat ./commands/docker/values/docker_image_name.txt`
DOCKER_VERSION=`cat ./commands/docker/values/docker_version.txt`
DOCKER_APP_PORT=`cat ./commands/docker/values/docker_app_port.txt`
DOCKER_IMAGE_PORT=`cat ./commands/docker/values/docker_image_port.txt`

docker run --name ${DOCKER_IMAGE_NAME}-con -e SPRING_PROFILES_ACTIVE=docker -p $DOCKER_IMAGE_PORT:$DOCKER_APP_PORT $DOCKER_USER_NAME/$DOCKER_IMAGE_NAME:$DOCKER_VERSION