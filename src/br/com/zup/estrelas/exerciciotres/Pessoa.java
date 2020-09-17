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

	public int calculaIdade(int anoNascimento) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		return anoAtual - anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}
}
