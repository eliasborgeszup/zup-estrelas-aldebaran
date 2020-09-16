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
		this.notaTrabalho = notaTrabalho;
	}
	
	public float calculaMedia() {
		float media = 0;
		
		float pesoProva = 2.5f, pesoTrabalho = 2;
		
		float somaPesoNotas = pesoProva + pesoTrabalho;
		
		float mediaPonderadaNotas = (this.provaUm * pesoProva) + (this.provaDois * pesoProva) + (this.notaTrabalho * pesoTrabalho);

		media = mediaPonderadaNotas / somaPesoNotas;

		return media;
	}
	
	public float provaFinal(float media) {
		float notaMaxima = 10;

		if (media > 6) {
			return 0;
		}
		
		return notaMaxima - media;
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

	public float getProvaDois() {
		return provaDois;
	}

	public float getNotaTrabalho() {
		return notaTrabalho;
	}
}
