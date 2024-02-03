# 현재 디렉토리의 코드를 기반으로 도커 이미지 빌드를 수행

DOCKER_USER_NAME=`cat ./commands/docker/values/docker_user_name.txt`
DOCKER_IMAGE_NAME=`cat ./commands/docker/values/docker_image_name.txt`
DOCKER_VERSION=`cat ./commands/docker/values/docker_version.txt`

rm -rf target
mvn package -B -D maven.test.skip=true
docker build --no-cache -t $DOCKER_USER_NAME/$DOCKER_IMAGE_NAME:$DOCKER_VERSION .