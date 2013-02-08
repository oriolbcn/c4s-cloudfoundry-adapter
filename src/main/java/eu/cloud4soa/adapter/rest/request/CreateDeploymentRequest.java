package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Default;
import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.response.CreateDeploymentResponse;

/**
 * Request for creation of resource <strong>Deployment</strong> 
 * <br><code>htt[p|ps]://baseUrl/application/${applicationName}/deployment/${deploymentName}</code>.<br>
 * 
 * Response will contain result of creation of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.POST)
@Path(component=Component.EMS,path="/application/${applicationName}/deployment/${deploymentName}")
public class CreateDeploymentRequest extends Request<CreateDeploymentResponse> implements Serializable{
	private static final long serialVersionUID = 8934479635366166405L;
	
	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	@NotNull @Default("default") @Ignore
	@UrlPath(pattern="${deploymentName}")
	private String deploymentName;
	
	public CreateDeploymentRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getDeploymentName() {
		return deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}
}
