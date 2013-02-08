package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class DeleteDeploymentResponse extends Response<DeleteDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 4870570574141168798L;

	public DeleteDeploymentResponse(){
	}
	
	@Override
	public String toString() {
		return "DeleteDeploymentResponse [Response=" + super.toString() + "]";
	}
}
