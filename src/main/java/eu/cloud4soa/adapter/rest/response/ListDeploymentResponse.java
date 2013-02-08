package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;
import java.util.Arrays;

import eu.cloud4soa.adapter.rest.response.model.Deployment;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class ListDeploymentResponse extends Response<ListDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = -1818559850363223477L;
	
	private Deployment[] deployments = new Deployment[0];
	
	public ListDeploymentResponse(){
	}

	public Deployment[] getDeployments() {
		return deployments;
	}

	public void setDeployments(Deployment[] deployments) {
		this.deployments = deployments;
	}

	@Override
	public String toString() {
		return "ListDeploymentResponse [deployments=" + Arrays.toString(deployments) + ", Response=" + super.toString() + "]";
	}
}
