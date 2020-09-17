package br.com.zup.estrelas.funcionariosuniversidades;

public class Coordernador extends Funcionario {

	private Professor[] professoresSupervisionados;

	public Coordernador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario) {

		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

		this.professoresSupervisionados = new Professor[10];
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}

	public void setProfessoresSupervisionados(Professor[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}

	public void adicionarProfessorSupervisionados(Professor professor) { //objeto
		
		//Professor p = new Professor(nome, cpf, numeroRegistro, orgaoLotacao, salario, nivelGraduacao,
		//		disciplinaMinistrada, quantidadeAlunos, quantidadeTurmas);
		
		for (int i = 0; i < professoresSupervisionados.length; i++) {
			if (professoresSupervisionados[i] == null) {
				professoresSupervisionados[i] = professor;
				break;
			}
		}

	}

	public void imprimirProfessoresSupervisionador() {
		for (Professor professor : professoresSupervisionados) {
			if (professor != null) {
				System.out.println("Nome: " + professor.getNome());
				System.out.println("CPF: " + professor.getCpf());
			}
		}

	}
}
