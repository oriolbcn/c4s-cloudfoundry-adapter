package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Deployment;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class DeploymentResponse extends Response<DeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 768026911931094418L;
	
	private Deployment deployment;
	
	public DeploymentResponse(){
	}

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	@Override
	public String toString() {
		return "DeploymentResponse [deployment=" + deployment + ", Response=" + super.toString() + "]";
	}
}
