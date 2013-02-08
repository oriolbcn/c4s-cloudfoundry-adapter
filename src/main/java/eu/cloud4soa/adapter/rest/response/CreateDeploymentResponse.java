package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Deployment;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class CreateDeploymentResponse extends Response<CreateDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 4683506328314822563L;
	
	private Deployment deployment;
	
	public CreateDeploymentResponse(){
	}

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	@Override
	public String toString() {
		return "CreateDeploymentResponse [deployment=" + deployment + ", Response=" + super.toString() + "]";
	}
}
