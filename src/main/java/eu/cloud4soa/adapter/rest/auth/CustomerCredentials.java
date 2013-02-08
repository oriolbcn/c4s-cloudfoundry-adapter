package eu.cloud4soa.adapter.rest.auth;


/**
 * Wrapper to provide a keyPair to access the adapter 
 * that lies on the PaaS
 * 
 * Implements the interface {@link #Credentials}
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class CustomerCredentials implements Credentials{

	private String apiKey;
	private String secretKey;
	
	public CustomerCredentials(){
	}

	public CustomerCredentials(String apiKey, String secretKey){
		this.apiKey = apiKey;
		this.secretKey = secretKey;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
}
