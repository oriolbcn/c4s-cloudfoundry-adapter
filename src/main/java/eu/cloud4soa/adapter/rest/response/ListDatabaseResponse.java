package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;
import java.util.Arrays;

import eu.cloud4soa.adapter.rest.response.model.Database;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class ListDatabaseResponse extends Response<ListDatabaseResponse> implements Serializable{
	private static final long serialVersionUID = 784945630851539433L;
	
	private Database[] databases = new Database[0];
	
	public ListDatabaseResponse(){
	}

	public Database[] getDatabases() {
		return databases;
	}

	public void setDatabases(Database[] databases) {
		this.databases = databases;
	}

	@Override
	public String toString() {
		return "ListDatabaseResponse [databases=" + Arrays.toString(databases) + ", Response=" + super.toString() + "]";
	}
}
