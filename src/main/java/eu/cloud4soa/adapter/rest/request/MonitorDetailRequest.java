package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.response.MonitorDetailResponse;

/**
 * Request for resource <strong>Monitor</strong> 
 * <br><code>htt[p|ps]://baseUrl/monitor/detail</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 *
 */
@Method(HttpMethod.GET)
@Path(component=Component.MONITOR,path="/detail")
public class MonitorDetailRequest extends Request<MonitorDetailResponse> implements Serializable{
	private static final long serialVersionUID = 8920336436991835495L;

	public MonitorDetailRequest(){
	}
}
