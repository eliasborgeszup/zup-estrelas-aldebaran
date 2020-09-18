package br.com.zup.estrelas.funcionariosuniversidades;

public class Coordernador extends Funcionario {

	private Professor[] professoresSupervisionados;

	public Coordernador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario) {

		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);

		this.professoresSupervisionados = new Professor[10];
	}
	
	public void adicionarProfessorSupervisionados(Professor professor) { 
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
				System.out.println("\n\nNome: " + professor.getNome());
				System.out.println("CPF: " + professor.getCpf());
				System.out.println("Numero registro: " + professor.getNumeroRegistro());
				System.out.println("Orgão lotação: " + professor.getOrgaoLotacao());
				System.out.println("Graduação: " + professor.getNivelGraduacao());
				System.out.println("Disciplina ministrada: " + professor.getDisciplinaMinistrada());
				System.out.println("Salario: " + professor.getSalario());
				System.out.println("Quantidade de turmas: " + professor.getQuantidadeTurmas());
				System.out.println("Quantidade de alunos: " + professor.getQuantidadeAlunos());
			}
		}

	}

	public void imprimirCoordenador() {
		System.out.println("\n\nNome: " + super.getNome());
		System.out.println("CPF: " + super.getCpf());
		System.out.println("Numero registro: " + super.getNumeroRegistro());
		System.out.println("Orgão lotação: " + super.getOrgaoLotacao());
		System.out.println("Salario: " + super.getSalario());
	}
}
