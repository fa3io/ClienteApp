package br.com.algar.clienteapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "CPF informado não é válido!")
public class CPFValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CPFValidationException(final String message) {
		super(message);
	}

}
