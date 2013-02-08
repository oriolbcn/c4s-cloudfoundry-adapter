package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class DeleteDatabaseResponse extends Response<DeleteDatabaseResponse> implements Serializable {
	private static final long serialVersionUID = -97770607377673758L;
	
	public DeleteDatabaseResponse(){
	}

	@Override
	public String toString() {
		return "DeleteDatabaseResponse [Response=" + super.toString() + "]";
	}
}
