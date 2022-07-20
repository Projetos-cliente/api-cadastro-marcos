package br.com.cruzvita.cadastro.exceptions;

public class IdentificadorInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IdentificadorInvalidoException() {
		super("Identificador com numero de caracteres inválidos a um CPF OU CNPJ!");
	}
}
