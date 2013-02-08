package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.Version;

/**
 * Superclass of all request objects
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Version("1.0")
@Method(HttpMethod.GET)
@Path(component=Component.ROOT)
public abstract class Request<T> implements Serializable{
	private static final long serialVersionUID = -8271055145789777669L;
	
//	private Map<String,List<Object>>
	@Ignore
	private int PORT;
	
	@Ignore
	private String BASEURL;
	
	@NotNull @Ignore
	private String apiKey;
	
	@Ignore
	private String hash;

	public String getBaseUrl() {
		return BASEURL;
	}

	public void setBaseUrl(String baseUrl) {
		this.BASEURL = baseUrl;
	}

	public int getPort() {
		return PORT;
	}

	public void setPort(int port) {
		this.PORT = port;
	}

	/* hash and api key*/
	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	/* hash and api key eom*/
}
