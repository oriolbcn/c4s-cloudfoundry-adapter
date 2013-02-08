package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Application;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class ApplicationResponse extends Response<ApplicationResponse> implements Serializable{
	private static final long serialVersionUID = -1769426304599982571L;
	
	private Application application;

	public ApplicationResponse(){
	}
	
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "ApplicationResponse [application=" + application + ", Response=" + super.toString() + "]";
	}
}

