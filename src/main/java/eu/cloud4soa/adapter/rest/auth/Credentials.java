package eu.cloud4soa.adapter.rest.auth;


/**
 * Interface to provide a key pair to access each adapter
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public interface Credentials {

	/**
	 * (self-explanatory)
	 * 
	 * @return apiKey the api key of the key pair
	 */
	public String getApiKey();
	
	/**
	 * (self-explanatory)
	 * 
	 * @return secretKey the secret key of the key pair
	 */
	public String getSecretKey();
}
