# 현재 디렉토리에서 생성된 이미지와 관련된 컨테이너의 로그 출력

DOCKER_IMAGE_NAME=`cat ./commands/docker/values/docker_image_name.txt`

docker logs ${DOCKER_IMAGE_NAME}-con