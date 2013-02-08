package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Module;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class EMSResponse extends Response<EMSResponse> implements Serializable{
	private static final long serialVersionUID = 7993013677898065804L;

	private Module module;
	
	public EMSResponse(){
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "EMSResponse [module=" + module + ", Response=" + super.toString() + "]";
	}
}
