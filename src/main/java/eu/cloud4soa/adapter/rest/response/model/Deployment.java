package eu.cloud4soa.adapter.rest.response.model;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class Deployment implements Serializable{
	private static final long serialVersionUID = -6822918079947700356L;
	
	private String applicationName;
	private String deploymentName;
	private String subDomain;
	private String state;
	/*
	 * (non-javadoc)
	 * the following 2 fields are technically from type date, 
	 * but i prefer to use string because parsing dates is not very funny
	 */
	private String created;
	private String modified;
	
	public Deployment(){
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

	public String getSubDomain() {
		return subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "Deployment [applicationName=" + applicationName + ", deploymentName=" + deploymentName + ", subDomain=" + subDomain + ", state=" + state
				+ ", created=" + created + ", modified=" + modified + "]";
	}
}