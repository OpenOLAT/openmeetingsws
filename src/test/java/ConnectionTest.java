import java.net.URL;

import javax.xml.namespace.QName;
import jakarta.xml.ws.BindingProvider;

import org.apache.openmeetings.axis.services.UserService;
import org.apache.openmeetings.axis.services.UserServicePortType;

public class ConnectionTest {
	
	/*
	 TEST for OpenMeetings 4.0.4
	public static final void main(String[] args) {
		try {
			String endPoint = "https://om.alteametasoft.com/openmeetings/services/UserService?wsdl";
			QName SERVICE_NAME = new QName("http://webservice.openmeetings.apache.org/", "org.apache.openmeetings.webservice.UserWebService");
			OrgApacheOpenmeetingsWebserviceUserWebService ss = new OrgApacheOpenmeetingsWebserviceUserWebService(new URL(endPoint), SERVICE_NAME);
			UserWebService port = ss.getUserService();
			((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPoint);
			((BindingProvider)port).getRequestContext().put("schema-validation-enabled", false);
			((BindingProvider)port).getRequestContext().put("set-jaxb-validation-event-handler", false);
			
			ServiceResult sessiondata = port.login("admin", "Serial#89");
			System.out.println(sessiondata);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*
	public static final void main(String[] args) {
		try {
			String endPoint = "http://localhost:5080/openmeetings/services/UserService?wsdl";
			QName SERVICE_NAME = new QName("http://webservice.openmeetings.apache.org/", "org.apache.openmeetings.webservice.UserWebService");
			
			UserService ss = new UserService();
			UserServicePortType port = ss.getUserServiceHttpSoap11Endpoint();
			((BindingProvider)port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPoint);
			

			
			ServiceResult sessiondata = port.login("admin", "Serial#89");
			System.out.println(sessiondata);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

}
