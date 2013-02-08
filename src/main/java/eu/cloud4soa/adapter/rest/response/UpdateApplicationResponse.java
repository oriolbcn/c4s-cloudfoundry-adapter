package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Application;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class UpdateApplicationResponse extends Response<UpdateApplicationResponse> implements Serializable{
	private static final long serialVersionUID = 3593118104292610514L;

	private Application application;
	
	public UpdateApplicationResponse(){
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "UpdateApplicationResponse [application=" + application + ", Response=" + super.toString() + "]";
	}
}