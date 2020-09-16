package br.com.zup.estrelas.exerciciodois;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		AlunosMatriculados alunos = new AlunosMatriculados("0001","Elias Junio Borges", 5, 5, 8);
		
		System.out.printf("Media: %.2f \n",  alunos.calculaMedia());
		
		if(alunos.provaFinal(alunos.calculaMedia()) == 0) {
			System.out.println("Parabens, você foi aprovado");
		} else {
			System.out.printf("Você precisa tirar %.2f pontos na prova de recuperação", alunos.provaFinal(alunos.calculaMedia()));
		}

	}

}
