package br.com.zup.estrelas.funcionariosuniversidades;

public class ControleFuncionarios {

	public static void main(String[] args) {
		Professor elias = new Professor("Elias", "000001", 010101, "Professor", 1000, "Mestrando", "Biologia", 0, 0);
		Professor gabriel = new Professor("Gabriel", "000002", 020202, "Professor", 1000, "Mestrando", "Comunicação", 0, 0);

		System.out.println("Salario antes do aumento: " + elias.getSalario());
		elias.aumentaSalario();
		System.out.println("Salario depois do aumento: " + elias.getSalario());

		Coordernador coordernador = new Coordernador("Joao", "000002", 010202, "Coordenador", 10000);

		coordernador.adicionarProfessorSupervisionados(elias);
		coordernador.adicionarProfessorSupervisionados(gabriel);

		coordernador.imprimirProfessoresSupervisionador();
	}

}
