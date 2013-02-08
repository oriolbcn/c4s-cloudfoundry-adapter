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
import eu.cloud4soa.adapter.rest.response.CreateDatabaseResponse;

/**
 * Request for creation of resource <strong>Database</strong> 
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicationName}/database/${databaseName}</code>.<br>
 * 
 * Response will contain result of creation of that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.POST)
@Path(component=Component.EMS, path="/application/${applicationName}/deployment/${deploymentName}/database/${databaseName}") // /databaseUser/${databaseUser}/databasePassword/${databasePassword}/databaseType/${databaseType}
public class CreateDatabaseRequest extends Request<CreateDatabaseResponse> implements Serializable{
	private static final long serialVersionUID = -6447997706427304871L;

	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	@NotNull @Default("default") @Ignore
	@UrlPath(pattern="${deploymentName}")
	private String deploymentName;
	
	@NotNull @Ignore
	@UrlPath(pattern="${databaseName}")
	private String databaseName;
	
	//@NotNull @Ignore
	//@UrlPath(pattern="${databaseUser}")	
	private String databaseUser;
	
	//@NotNull @Ignore
	//@UrlPath(pattern="${databasePassword}")	        
	private String databasePassword;
	
 	//@NotNull @Ignore
	//@UrlPath(pattern="${databaseType}")	       
	private String databaseType;
	
        
        
	public CreateDatabaseRequest(){
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

	public String getDatabaseUser() {
		return databaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
	}

	public String getDatabasePassword() {
		return databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
        
        
        
}
