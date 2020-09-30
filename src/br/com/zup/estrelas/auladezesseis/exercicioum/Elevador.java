package br.com.zup.estrelas.auladezesseis.exercicioum;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadePessoasElevador;
	private int quantidadePessoasPresente;
 
	public Elevador(int totalAndares, int capacidadePessoasElevador) {
		this.totalAndares = totalAndares;
		this.capacidadePessoasElevador = capacidadePessoasElevador;
		this.andarAtual = 0;
		this.quantidadePessoasPresente = 0;
	}
	
	public boolean entra() throws ElevadorException {
		if (this.quantidadePessoasPresente < this.capacidadePessoasElevador) {
			this.quantidadePessoasPresente++;
			return true;
		}
		
		throw new CargaException("Elevador cheio, aguarde um pouco!");
	}
	
	public boolean sai() throws ElevadorException {
		if(this.quantidadePessoasPresente > 0) {
			this.quantidadePessoasPresente--;
			return true;
		}
		throw new CargaException("N�o existe pessoas no elevador");
	}
	
	public void sobe(int quantidadeAndar) {
		for (int i = 0; i < quantidadeAndar; i++) {
			if(this.andarAtual < this.totalAndares) {
				this.andarAtual++;
			} else {
				this.andarAtual = this.totalAndares;
				System.out.println("\nChegamos ao ultimo andar, 10� Andar");
				break;
			}
		}
	}
	
	public void desce(int quantidadeAndar) {
		for (int i = 0; i <= quantidadeAndar; i++) {
			if(this.andarAtual > 0) {
				this.andarAtual--;
			} else {
				this.andarAtual = 0;
				System.out.println("Chegamos ao terreo");
				break;
			}
		}
	}
	
	
	public void setQuantidadePessoasPresente(int quantidadePessoasPresente) {
		this.quantidadePessoasPresente = quantidadePessoasPresente;
	}

	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int getQuantidadePessoasPresente() {
		return quantidadePessoasPresente;
	}
}
