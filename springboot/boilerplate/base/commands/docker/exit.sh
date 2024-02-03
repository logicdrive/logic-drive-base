# 현재 디렉토리에서 생성된 이미지와 관련된 컨테이너 종료

DOCKER_IMAGE_NAME=`cat ./commands/docker/values/docker_image_name.txt`

docker container stop ${DOCKER_IMAGE_NAME}-con
docker container rm ${DOCKER_IMAGE_NAME}-con