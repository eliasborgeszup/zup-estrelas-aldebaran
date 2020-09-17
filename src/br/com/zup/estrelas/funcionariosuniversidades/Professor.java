package br.com.zup.estrelas.funcionariosuniversidades;

public class Professor extends Funcionario{
	private String nivelGraduacao;
	private String disciplinaMinistrada;
	private int quantidadeAlunos;
	private int quantidadeTurmas;
	
	public Professor(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario, String nivelGraduacao,
			String disciplinaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
		
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplinaMinistrada = disciplinaMinistrada;
		this.quantidadeAlunos = quantidadeAlunos;
		this.quantidadeTurmas = quantidadeTurmas;
	}

	public String getNivelGraduacao() {
		return nivelGraduacao;
	}

	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}

	public String getDisciplinaMinistrada() {
		return disciplinaMinistrada;
	}

	public void setDisciplinaMinistrada(String disciplinaMinistrada) {
		this.disciplinaMinistrada = disciplinaMinistrada;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public int getQuantidadeTurmas() {
		return quantidadeTurmas;
	}

	public void setQuantidadeTurmas(int quantidadeTurmas) {
		this.quantidadeTurmas = quantidadeTurmas;
	}
	
	
}
