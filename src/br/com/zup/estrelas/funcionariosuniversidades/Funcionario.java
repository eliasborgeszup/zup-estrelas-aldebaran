package br.com.zup.estrelas.funcionariosuniversidades;

public class Funcionario {
	private String nome;
	private String cpf;
	private int numeroRegistro;
	private String orgaoLotacao;
	private float salario;
	
	public Funcionario(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroRegistro = numeroRegistro;
		this.orgaoLotacao = orgaoLotacao;
		this.salario = salario;
	}
	
	public void aumentaSalario() {	
		this.salario = this.salario * 1.1f;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getOrgaoLotacao() {
		return orgaoLotacao;
	}
	public void setOrgaoLotacao(String orgaoLotacao) {
		this.orgaoLotacao = orgaoLotacao;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void aumentoSalario() {
		// TODO Auto-generated method stub
		
	}
}
