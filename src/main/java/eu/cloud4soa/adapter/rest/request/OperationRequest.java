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
import eu.cloud4soa.adapter.rest.common.Operation;
import eu.cloud4soa.adapter.rest.response.OperationResponse;

/**
 * Request for resource <strong>Operation</strong> 
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicationName}/operation/${operationName}</code>.<br>
 * 
 * Response will contain details of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.POST)
@Path(component = Component.EMS, path = "/application/${applicationName}/operation/${operationName}")
public class OperationRequest extends Request<OperationResponse> implements Serializable {
	private static final long serialVersionUID = 392445718760721622L;

	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	@NotNull @Default("nop") @Ignore
	@UrlPath(pattern="${operationName}")
	private String operationName;
	
	public OperationRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getOperationName() {
		return operationName;
	}
	
	public void setOperation(Operation operation) {
		this.operationName = operation.toString();
	}
}
