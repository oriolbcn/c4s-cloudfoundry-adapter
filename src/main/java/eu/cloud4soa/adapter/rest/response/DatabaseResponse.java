package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Database;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class DatabaseResponse extends Response<DatabaseResponse> implements Serializable {
	private static final long serialVersionUID = 989582719240054110L;

	private Database database;
	
	public DatabaseResponse(){
	}
	
	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "DatabaseResponse [database=" + database + ", Response=" + super.toString() + "]";
	}
}
