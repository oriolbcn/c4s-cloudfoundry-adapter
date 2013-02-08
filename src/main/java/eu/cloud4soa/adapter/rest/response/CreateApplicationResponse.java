package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Application;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class CreateApplicationResponse extends Response<CreateApplicationResponse> implements Serializable{
	private static final long serialVersionUID = 5418975081132203525L;
	
	private Application application;
	
	public CreateApplicationResponse(){
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "CreateApplicationResponse [application=" + application + ", Response=" + super.toString() + "]";
	}
}