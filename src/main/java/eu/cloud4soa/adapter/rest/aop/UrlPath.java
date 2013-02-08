package eu.cloud4soa.adapter.rest.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes the a <code>part</code> of an <code>url</code> on what a request
 * will be sent. <br>
 * <strong>Note:</strong> this @interface does not need an interceptor yet.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Ignore
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface UrlPath {

	/**
	 * The pattern to look for to replace at the mapped resource
	 * 
	 * @return String the pattern
	 */
	String pattern() default "";
}
