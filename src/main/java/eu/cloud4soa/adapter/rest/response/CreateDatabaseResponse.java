package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Database;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class CreateDatabaseResponse extends Response<CreateDatabaseResponse> implements Serializable{
	private static final long serialVersionUID = -2014668569060077329L;
	
	private Database database;
	
	public CreateDatabaseResponse(){
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

	
	@Override
	public String toString() {
		return "CreateDatabaseResponse [database=" + database + ", Response=" + super.toString() + "]";
	}
	
	
}