package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.common.HttpStatus;

/**
 * Superclass of all response objects
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public abstract class Response<T> implements Serializable {
	private static final long serialVersionUID = 321536200117064375L;

	private String message;
	private HttpStatus statusCode;
	private long responseTime;

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public long getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", statusCode=" + statusCode + ", responseTime=" + responseTime + "]";
	}
}
