package eu.cloud4soa.adapter.rest.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;

/**
 * Describes the <code>url path</code> on what the request has to be sent. <br>
 * <strong>Note:</strong> this @interface does not need an interceptor yet.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
public @interface Path {
	
	/**
	 * component ROOT -> /
	 * component ems -> /ems
	 * component monitor -> /monitor
	 */
	public enum Component {

		ROOT,
		EMS,
		MONITOR;
		
		public String el(){
			if(this == ROOT){
				return "/";
			}
			return ("/"+this.name().toLowerCase(Locale.ENGLISH));
		}
	}
	
	/* the adapter component */
	Component component() default Component.ROOT;
	
	/* the request path */
	String path() default "";
}
