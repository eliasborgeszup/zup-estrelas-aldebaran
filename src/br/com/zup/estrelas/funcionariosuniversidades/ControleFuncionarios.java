package br.com.zup.estrelas.funcionariosuniversidades;

public class ControleFuncionarios {
	
	public static void imprimiAdministrador(Administrativo idnilsonAdministrativo) {
		System.out.println("\n\nNome: " + idnilsonAdministrativo.getNome());
		System.out.println("CPF: " + idnilsonAdministrativo.getCpf());
		System.out.println("Numero registro: " + idnilsonAdministrativo.getNumeroRegistro());
		System.out.println("Orgão lotação: " + idnilsonAdministrativo.getOrgaoLotacao());
		System.out.println("Salario: " + idnilsonAdministrativo.getSalario());
		System.out.println("Função: " + idnilsonAdministrativo.getFuncaoAdministrativa());
		System.out.println("Senioridade: " + idnilsonAdministrativo.getSenioridade());
	}
	
	public static void main(String[] args) {
		Professor elias = new Professor("Elias", "000001", 010101, "Professor", 1000, "Mestrando", "Biologia", 0, 0);
		Professor gabriel = new Professor("Gabriel", "000002", 020202, "Professor", 1000, "Mestrando", "Comunicação", 0, 0);
		Coordernador joaoCoordenador = new Coordernador("Joao", "000003", 030303, "Coordenação", 10000);
		Administrativo idnilsonAdministrativo = new Administrativo("Idinilson", "000004", 040404, "Administrativo", 7500, "Assistente Administrativo", "Pleno III");
		
		elias.adicionarTurmas(1, 30);
		elias.adicionarTurmas(2, 150);
		
		gabriel.adicionarTurmas(1, 15);
		
		elias.aumentaSalario();
		elias.aumentaSalario();
		gabriel.aumentaSalario();
		idnilsonAdministrativo.aumentaSalario();
		joaoCoordenador.aumentaSalario();
		
		System.out.println("- Cordenador e Professores supervisionados - ");
		joaoCoordenador.imprimirCoordenador();
		
		joaoCoordenador.adicionarProfessorSupervisionados(elias);
		joaoCoordenador.adicionarProfessorSupervisionados(gabriel);
		joaoCoordenador.imprimirProfessoresSupervisionador();	
		
		System.out.println("- Administratador -");
		imprimiAdministrador(idnilsonAdministrativo);

	}

}
