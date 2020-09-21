package br.com.zup.estrelas.funcionariosuniversidades;

public class ControleFuncionario {
	
	public static void imprimiAdministrador(Administrativo administrativo) {
		System.out.println("\n\nNome: " + administrativo.getNome());
		System.out.println("CPF: " + administrativo.getCpf());
		System.out.println("Numero registro: " + administrativo.getNumeroRegistro());
		System.out.println("Orgão lotação: " + administrativo.getOrgaoLotacao());
		System.out.println("Salario: " + administrativo.getSalario());
		System.out.println("Função: " + administrativo.getFuncaoAdministrativa());
		System.out.println("Senioridade: " + administrativo.getSenioridade());
	}
	
	public static void main(String[] args) {
		Professor elias = new Professor("Elias", "000001", 010101, "Professor", 1000, "Mestrando", "Biologia");
		Professor gabriel = new Professor("Gabriel", "000002", 020202, "Professor", 1000, "Mestrando", "Comunicação");
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
