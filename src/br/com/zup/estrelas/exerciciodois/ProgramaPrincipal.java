package br.com.zup.estrelas.exerciciodois;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		AlunosMatriculados alunos = new AlunosMatriculados("0001","Elias Junio Borges", 5, 5, 8);
		
		System.out.printf("Media: %.2f \n",  alunos.calculaMedia());
		
		if(alunos.provaFinal(alunos.calculaMedia()) == 0) {
			System.out.println("Parabens, voc� foi aprovado");
		} else {
			System.out.printf("Voc� precisa tirar %.2f pontos na prova de recupera��o", alunos.provaFinal(alunos.calculaMedia()));
		}

	}

}
