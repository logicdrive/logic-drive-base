# 현재 디렉토리에서 생성된 이미지 및 관련 컨테이너를 전부 삭제

DOCKER_USER_NAME=`cat ./commands/docker/values/docker_user_name.txt`
DOCKER_IMAGE_NAME=`cat ./commands/docker/values/docker_image_name.txt`
DOCKER_VERSION=`cat ./commands/docker/values/docker_version.txt`

docker container stop ${DOCKER_IMAGE_NAME}-con
docker container rm ${DOCKER_IMAGE_NAME}-con
docker image rm $DOCKER_USER_NAME/$DOCKER_IMAGE_NAME:$DOCKER_VERSION