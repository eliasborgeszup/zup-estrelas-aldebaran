package br.com.zup.estrelas.auladezesseis.exercicioum;

public class ElevadorException extends Exception {

	private static final long serialVersionUID = 1L;

	private String mensagem;

	public ElevadorException(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}

}
