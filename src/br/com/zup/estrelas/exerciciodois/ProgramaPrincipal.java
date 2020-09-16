package br.com.zup.estrelas.exerciciodois;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		AlunosMatriculados elias = new AlunosMatriculados("0001", "Elias Borges", 5, 5, 8);
		AlunosMatriculados jose = new AlunosMatriculados("0002", "Jose Campos", 1, 1, 2);

		System.out.printf("Nome: %s", elias.getNome());
		System.out.printf("\nMatricula: %s", elias.getMatricula());
		System.out.printf("\nNota 01: %.2f Nota 02: %.2f Trabalho: %.2f Media: %.2f \n", elias.getProvaUm(),
				elias.getProvaDois(), elias.getNotaTrabalho(), elias.calculaMedia());

		if (elias.provaFinal(elias.calculaMedia()) == 0) {
			System.out.println("Parabens, você foi aprovado");
		} else {
			System.out.printf("Você precisa tirar %.2f pontos na prova final\n",
					elias.provaFinal(elias.calculaMedia()));
		}

		System.out.printf("\nNome: %s", jose.getNome());
		System.out.printf("\nMatricula: %s", jose.getMatricula());
		System.out.printf("\nNota 01: %.2f Nota 02: %.2f Trabalho: %.2f Media: %.2f \n", jose.getProvaUm(),
				jose.getProvaDois(), jose.getNotaTrabalho(), jose.calculaMedia());

		if (jose.provaFinal(jose.calculaMedia()) == 0) {
			System.out.println("Parabens, você foi aprovado");
		} else {
			System.out.printf("Você precisa tirar %.2f pontos na prova final", 
					jose.provaFinal(jose.calculaMedia()));
		}

	}

}
