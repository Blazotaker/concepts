package com.blazotaker.springboot.backend.apirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 1L;

}
