package eu.cloud4soa.adapter.rest.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes the <code>HTTP method</code> to use to request the adapter. <br>
 * <strong>Note:</strong> this @interface does not need an interceptor yet.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
public @interface Method {
	
	/**
	 * available HTTP methods
	 */
	public enum HttpMethod {
		GET,
		POST,
		PUT,
		DELETE;
	}
	
	/**
	 * @return Method the HTTP method 
	 */
	HttpMethod value();
}