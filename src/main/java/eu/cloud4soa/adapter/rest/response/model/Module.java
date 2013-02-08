package eu.cloud4soa.adapter.rest.response.model;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class Module implements Serializable{
	private static final long serialVersionUID = -517667404281137387L;
	
	private String moduleName;
	private String description;
	private String version;
	
	public Module(){
	}	
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", description=" + description + ", version=" + version + "]";
	}
}
