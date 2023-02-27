package Desafio;

public class ParametrosInvalidosException extends Throwable {

	private static final long serialVersionUID = 1L;
	/**
	*
	*/
	public String getMessage() {
		String str = "\nO valor 1 não pode ser maior que o valor 2\n";
		return str;
	}
	}