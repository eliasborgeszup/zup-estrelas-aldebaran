package br.com.zup.estrelas.aulaquinze.exercicioum;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Programador programador = new Programador("João da Silva", "0000000000", 1400, 44, "Java", "Back-End");
		
		LiderTecnico techLead = new LiderTecnico("José da Silva", "0000000001", 1500, 40);
		
		techLead.adicionarPogramadorSupervisionados(programador);
	}

}
