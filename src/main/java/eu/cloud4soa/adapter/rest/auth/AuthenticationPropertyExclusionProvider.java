package eu.cloud4soa.adapter.rest.auth;


/**
 * TODO
 * 		replace this class and use annotation like "@NoHashGen" 
 * 		or something else that reflects its purpose.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class AuthenticationPropertyExclusionProvider{

	public static String[] EXCLUSIONS = {
		"serialVersionUID",
	};
}
