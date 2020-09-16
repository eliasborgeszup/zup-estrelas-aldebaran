package br.com.zup.estrelas.exerciciodois;

public class AlunosMatriculados {
	private String matricula;
	private String nome;
	private float provaUm;
	private float provaDois;
	private float notaTrabalho;
	
	public AlunosMatriculados (String matricula, String nome, float provaUm, float provaDois, float notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.provaUm = provaUm;
		this.provaDois = provaDois;
		this.matricula = matricula;
	}
	
	public float media() {
		float media = 0;
		float pesoProva = 2.5f, pesoTrabalho = 2;
		media = this.provaUm * pesoProva + this.provaDois * pesoProva + this.notaTrabalho * pesoTrabalho
				/ this.notaTrabalho + this.provaUm + this.provaDois;
		return media;
	}
	
	public float provaFinal() {
		float media = media();
		if (media > 6) {
			return 0;
		}
		return 100 - media;
	}
	public String getMatricula() {
		return matricula; 
	}
	
	public String getNome() {
		return nome;
	}

	public float getProvaUm() {
		return provaUm;
	}

	public void setProvaUm(float provaUm) {
		this.provaUm = provaUm;
	}

	public float getProvaDois() {
		return provaDois;
	}

	public void setProvaDois(float provaDois) {
		this.provaDois = provaDois;
	}

	public float getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
}
