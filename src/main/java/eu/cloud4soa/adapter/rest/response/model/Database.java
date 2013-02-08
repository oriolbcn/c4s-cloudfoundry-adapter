package eu.cloud4soa.adapter.rest.response.model;

import java.io.Serializable;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class Database implements Serializable{
	private static final long serialVersionUID = -5954065370758249563L;
	
	private String databaseName;
	private String userName;
	private String password;
	private String host;
	private String port;
	
	public Database(){
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Database [databaseName=" + databaseName + ", userName=" + userName + ", password=" + password + ", host=" + host + ", port=" + port + "]";
	}
}