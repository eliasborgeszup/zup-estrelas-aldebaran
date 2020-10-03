package br.com.zup.estrelas.aulaquinze.exercicioum;

import br.com.zup.estrelas.funcionariosuniversidades.Professor;

public class LiderTecnico extends Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;

	private Programador[] programadoresSupervisionados;

	public LiderTecnico(String nome, String cpf, double salario, double horasSemanais) {
		super(nome, cpf, salario, horasSemanais);

		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.horasSemanais = horasSemanais;
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.5);
	}

	public void adicionarPogramadorSupervisionados(Programador programador) {
		for (int i = 0; i < this.programadoresSupervisionados.length; i++) {
			if (this.programadoresSupervisionados[i] == null) {
				this.programadoresSupervisionados[i] = programador;
				break;
			}
		}
	}

}
