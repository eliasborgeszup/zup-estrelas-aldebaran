package br.com.zup.estrelas.aulavinteeum.exercicio.quatro;

public class EstacionamentoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	
	public EstacionamentoException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
}
