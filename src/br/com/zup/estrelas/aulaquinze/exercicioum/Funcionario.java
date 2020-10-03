package br.com.zup.estrelas.aulaquinze.exercicioum;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;
	
	public Funcionario(String nome, String cpf, double salario, double horasSemanais) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.horasSemanais = horasSemanais;
		}
	
	public abstract void aumentaSalario();
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
