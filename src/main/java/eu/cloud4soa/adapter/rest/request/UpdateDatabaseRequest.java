package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Default;
import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.response.UpdateDatabaseResponse;

/**
 * Request for update of resource <strong>Database</strong>  
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicationName}/database/${databaseName}</code>.<br>
 * 
 * Response will contain result of update about that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.PUT)
@Path(component=Component.EMS,path="/application/${applicationName}/deployment/${deploymentName}/database/${databaseName}")
public class UpdateDatabaseRequest extends Request<UpdateDatabaseResponse> implements Serializable{
	private static final long serialVersionUID = 3919530079323420344L;

	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	@NotNull @Default("default") @Ignore
	@UrlPath(pattern="${deploymentName}")
	private String deploymentName;
	
	@NotNull @Default("db") @Ignore
	@UrlPath(pattern="${databaseName}")
	private String databaseName;
	
	public UpdateDatabaseRequest(){
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getDeploymentName() {
		return deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}
}
