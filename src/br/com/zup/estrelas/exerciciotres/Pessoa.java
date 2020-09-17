package br.com.zup.estrelas.exerciciotres;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;

	public Pessoa() {
		this.nome = null;
		this.idade = 0;
		this.altura = 0;
	}
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}
}
