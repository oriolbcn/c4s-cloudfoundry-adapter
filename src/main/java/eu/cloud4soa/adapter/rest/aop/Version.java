package eu.cloud4soa.adapter.rest.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes the <code>version</code> of the adapter api. <br>
 * <strong>Note:</strong> this @interface does not need an interceptor yet.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
@Inherited
public @interface Version {

	String value() default "1.0";
}
