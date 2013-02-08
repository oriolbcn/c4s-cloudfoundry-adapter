package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Deployment;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class UpdateDeploymentResponse extends Response<UpdateDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 2052452773807654356L;

	private Deployment deployment;
	
	public UpdateDeploymentResponse(){
	}

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	@Override
	public String toString() {
		return "UpdateDeploymentResponse [deployment=" + deployment + ", Response=" + super.toString() + "]";
	}
}
