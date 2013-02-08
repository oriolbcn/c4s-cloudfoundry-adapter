package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;
import java.util.Arrays;

import eu.cloud4soa.adapter.rest.response.model.Application;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class ListApplicationResponse extends Response<ListApplicationResponse> implements Serializable{
	private static final long serialVersionUID = 7002393373306229032L;
	
	private Application[] applications = new Application[0];
	
	public ListApplicationResponse(){
	}
	
	public Application[] getApplications() {
		return applications;
	}

	public void setApplications(Application[] applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "ListApplicationResponse [applications=" + Arrays.toString(applications) + ", Response=" + super.toString() + "]";
	}
}
