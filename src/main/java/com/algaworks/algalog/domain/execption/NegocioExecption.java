package com.algaworks.algalog.domain.execption;

public class NegocioExecption extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NegocioExecption(String message) {
		super(message);
	}

}