package eu.cloud4soa.adapter.rest.common;

import java.util.Locale;

public enum Operation{
	
	nop,
	start, 
	stop;
	
	@Override
	public String toString() {
		return this.name().toLowerCase(Locale.ENGLISH);
	};
	
	public static Operation toOperation(String operationName){
		return Operation.valueOf(operationName);
	}
}
