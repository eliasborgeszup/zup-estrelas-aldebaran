package br.com.zup.estrelas.auladezesseis.bancozup.exceptions;

public class ClienteException extends Exception{	
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	public ClienteException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
