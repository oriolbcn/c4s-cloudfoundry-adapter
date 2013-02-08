package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.response.EMSResponse;

/**
 * Request for resource <strong>Execution Management Module</strong> 
 * <br><code>htt[p|ps]://baseUrl/ems</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.GET)
@Path(component=Component.EMS, path="")
public class EMSRequest extends Request<EMSResponse> implements Serializable{
	private static final long serialVersionUID = 2837649792524227621L;

	public EMSRequest(){
	}
}
