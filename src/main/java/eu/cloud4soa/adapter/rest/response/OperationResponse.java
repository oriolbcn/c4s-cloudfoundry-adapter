package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class OperationResponse extends Response<OperationResponse> implements Serializable{
	private static final long serialVersionUID = -8685775063871156281L;

	public OperationResponse(){
	}

	@Override
	public String toString() {
		return "OperationResponse [Response=" + super.toString() + "]";
	}	
}
