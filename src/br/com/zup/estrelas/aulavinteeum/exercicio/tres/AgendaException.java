package br.com.zup.estrelas.aulavinteeum.exercicio.tres;

public class AgendaException extends Exception{
	
	private String mensagem;
	
	private static final long serialVersionUID = 1L;
	
	public AgendaException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
