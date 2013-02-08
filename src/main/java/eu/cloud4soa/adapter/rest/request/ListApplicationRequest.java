package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.response.ListApplicationResponse;

/**
 * Request for list of resource <strong>Application</strong> 
 * <br><code>htt[p|ps]://baseUrl/ems/application</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.GET)
@Path(component=Component.EMS,path="/application")
public class ListApplicationRequest extends Request<ListApplicationResponse> implements Serializable{
	private static final long serialVersionUID = 5233712157564688788L;

	public ListApplicationRequest(){
	}
}