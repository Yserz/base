# Home


## Run

```bash
# with spring-boot-maven-plugin
mvn spring-boot:run -Pdev

# as executable war
mvn clean package -Pdev
java -jar target/*.war

# create deployable war
mvn clean package -Pdeployable
```

## Environment

- [JBoss EWS 2.1.0](https://access.redhat.com/articles/111723) (Tomcat 7.0.54, OpenJDK 7)