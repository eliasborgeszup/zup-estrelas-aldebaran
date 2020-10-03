package br.com.zup.estrelas.aulaquinze.exercicioum;

public class Programador extends Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;
	private String linguagem;
	private String tipoProgramador;

	public Programador(String nome, String cpf, double salario, double horasSemanais, String linguagem,
			String tipoProgramador) {
		super(nome, cpf, salario, horasSemanais);
		this.linguagem = linguagem;
		this.tipoProgramador = tipoProgramador;
	}

	@Override
	public void aumentaSalario() {
		if (this.linguagem.equals("Java")) {
			super.setSalario(super.getSalario() * 1.5);
		} else {
			this.salario = this.salario * 1.3;
		}
	}
}
