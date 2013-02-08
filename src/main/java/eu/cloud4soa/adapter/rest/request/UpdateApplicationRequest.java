package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.response.UpdateApplicationResponse;

/**
 * Request for update of resource <strong>Application</strong>  
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicatioName}</code>.<br>
 * 
 * Response will contain result of update about that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.PUT)
@Path(component=Component.EMS,path="/application/${applicationName}")
public class UpdateApplicationRequest extends Request<UpdateApplicationResponse> implements Serializable{
	private static final long serialVersionUID = -5457426618721168112L;
	
	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	public UpdateApplicationRequest() {
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
