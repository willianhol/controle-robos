package br.com.nasa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class ForaDoPerimetroException extends RuntimeException {

	private static final long serialVersionUID = 1950423998601410401L;

	public ForaDoPerimetroException() {
		super("Fora do perimetro.");
	}
}
