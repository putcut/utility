# java-gradle-spring-boot-postgresql
## build.gradle
```
implementation 'org.postgresql:postgresql:latest.release'
```

## application.yml
```
spring:
  datasource:
    # use service name in docker compose
    url: jdbc:postgresql://db:5432/postgres
    username: postgres
    password: postgres
    driver-class-name: org.postgresql.Driver
```