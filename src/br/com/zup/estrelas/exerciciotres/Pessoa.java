package br.com.zup.estrelas.exerciciotres;

import java.util.Calendar;

public class Pessoa {
	private String nome;
	private int anoNascimento;
	private float altura;
	
	public Pessoa(String nome, int anoNascimento, float altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}
	//Professor fez a impressao aqui
	
	
	public int calculaIdade(int anoNascimento) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		return anoAtual - anoNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	//Solu��o do professor ele tamb�m criou o setAltura
	public float getAltura() {
		return altura;
	}

}
