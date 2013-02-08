package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.response.DeleteApplicationResponse;

/**
 * Request for deletion of resource <strong>Application</strong> 
 * <br><code>htt[p|ps]://baseUrl/application/${applicationName}</code>.<br>
 * 
 * Response will contain result of deletion about that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.DELETE)
@Path(component=Component.EMS,path="/application/${applicationName}")
public class DeleteApplicationRequest extends Request<DeleteApplicationResponse> implements Serializable{
	private static final long serialVersionUID = 5630465663637091403L;

	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	public DeleteApplicationRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
