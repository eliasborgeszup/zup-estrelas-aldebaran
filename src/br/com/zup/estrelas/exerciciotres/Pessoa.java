package br.com.zup.estrelas.exerciciotres;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Float altura;
	
	//Static - Quando o programa inicializar vai executar
	//Final - Não deixa que a variavel seja alterada
	public static final int QUANTIDADE_PESSOAS_ADICIONADAS = 10;

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
