package eu.cloud4soa.adapter.rest.response;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.response.model.Module;

/**
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
public class MonitorResponse extends Response<MonitorResponse> implements Serializable{
	private static final long serialVersionUID = -531328646450538524L;
	
	private Module module;
	
	public MonitorResponse(){
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	@Override
	public String toString() {
		return "MonitorResponse [module=" + module + ", Response=" + super.toString() + "]";
	}
}
