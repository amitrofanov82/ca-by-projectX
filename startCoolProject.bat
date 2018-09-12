REM uncomment to use postgre db profile
REM mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=devpg"

REM uncomment to use h2 in memory db
mvn spring-boot:run -Dspring-boot.run.profiles=devh2


