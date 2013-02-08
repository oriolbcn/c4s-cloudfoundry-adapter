package eu.cloud4soa.adapter.rest.exception;

public class RequestValidationException extends AdapterClientException{
	private static final long serialVersionUID = 7802044949224418292L;

	public RequestValidationException(String message){
		super(message);
	}

}
