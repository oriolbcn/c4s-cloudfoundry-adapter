package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Database;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class UpdateDatabaseResponse extends Response<UpdateDatabaseResponse> implements Serializable {
	private static final long serialVersionUID = 7100828949055516960L;

	private Database database;
	
	public UpdateDatabaseResponse(){
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "UpdateDatabaseResponse [database=" + database + ", Response=" + super.toString() + "]";
	}
}
