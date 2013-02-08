package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.response.ListDeploymentResponse;

/**
 * Request for list of resource <strong>Deployment</strong> 
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicationName}/deployment</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.GET)
@Path(component=Component.EMS,path="/application/${applicationName}/deployment")
public class ListDeploymentRequest extends Request<ListDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 5058756143091174312L;

	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	public ListDeploymentRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
