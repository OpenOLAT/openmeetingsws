# OpenMeetings WS for OpenOLAT

To recompile the WSDL firsst download them and place them in src/main/resssources

```
localhost:5080/openmeetings/services/UserService?wsdl
localhost:5080/openmeetings/services/RoomService?wsdl
localhost:5080/openmeetings/services/CalendarService?wsdl
```

Delete the java code in src/main/java and recompile the WSDLs:

```bash
mvn clean generate-sources
```

Than you have regenerate the java code:

```bash
mvn package
```