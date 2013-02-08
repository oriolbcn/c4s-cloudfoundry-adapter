package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class MonitorDetailResponse extends Response<MonitorDetailResponse> implements Serializable{
	private static final long serialVersionUID = 4692699083699976437L;

	public MonitorDetailResponse(){
	}

	@Override
	public String toString() {
		return "MonitorDetailResponse [Response=" + super.toString() + "]";
	}
}