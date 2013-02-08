package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.response.MonitorResponse;

/**
 * Request for resource <strong>Monitor</strong> 
 * <br><code>htt[p|ps]://baseUrl/monitor/</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.GET)
@Path(component=Component.MONITOR, path="")
public class MonitorRequest extends Request<MonitorResponse> implements Serializable{
	private static final long serialVersionUID = 2278984309731625818L;

	public MonitorRequest(){
	}
}
