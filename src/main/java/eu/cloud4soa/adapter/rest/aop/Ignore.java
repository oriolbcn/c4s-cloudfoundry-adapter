package eu.cloud4soa.adapter.rest.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * There will not generated an hash of the annotated <code>value</code>.<br>
 * <strong>Note:</strong> this @interface does not need an interceptor yet.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Ignore {

}
