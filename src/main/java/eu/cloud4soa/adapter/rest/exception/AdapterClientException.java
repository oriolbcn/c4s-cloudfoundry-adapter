package eu.cloud4soa.adapter.rest.exception;

import java.io.IOException;

public class AdapterClientException extends IOException{
	private static final long serialVersionUID = -3536006993976807290L;

	public AdapterClientException(String message){
		super(message);
	}
}
