package br.com.zup.estrelas.aulavinteeum.exercicio.tres;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Float altura;
	
	public Pessoa() {

	}
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		
		//String idade = String.valueOf(idade);
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
