package eu.cloud4soa.adapter.rest;

import java.io.IOException;

import eu.cloud4soa.adapter.rest.auth.Credentials;
import eu.cloud4soa.adapter.rest.exception.AdapterClientException;
import eu.cloud4soa.adapter.rest.request.Request;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 *
 */
public interface AdapterClient {

	/**
	 * @param t the typed request
	 * @return response the response to expect
	 * @throws IOException 
	 */
	public <T> T send(Request<T> t, Credentials credentials) throws AdapterClientException;
	
	public String getAdapterRootPath();	
}
