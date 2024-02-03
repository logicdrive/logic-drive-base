# 개발 환경에서 프로그램을 간편하게 동작시키기 위한 커맨드

rm -rf logs
rm -rf target

export SPRING_PROFILES_ACTIVE=host
mvn spring-boot:run