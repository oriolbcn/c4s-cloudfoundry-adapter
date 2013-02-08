package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class DeleteApplicationResponse extends
		Response<DeleteApplicationResponse> implements Serializable {
	private static final long serialVersionUID = -8954246275281219228L;

	public DeleteApplicationResponse() {
	}

	@Override
	public String toString() {
		return "DeleteApplicationResponse [Response=" + super.toString() + "]";
	}
}