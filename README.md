# OpenMeetings WS for OpenOLAT


The project doesn't contains Java classes, they are generated with maven.

To recompile the WSDL first download them and place them in src/main/resssources

```
localhost:5080/openmeetings/services/UserService?wsdl
localhost:5080/openmeetings/services/RoomService?wsdl
localhost:5080/openmeetings/services/CalendarService?wsdl
```

Delete the java code in src/main/java and recompile the WSDLs with:

```bash
mvn clean generate-sources
```

Than you have regenerate the java code and you can package the code:

```bash
mvn package
```