package br.com.zup.estrelas.exerciciotres;

import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void armazenaPessoa(Agenda agenda) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome completo: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.print("Digite sua altura: ");
		float altura = teclado.nextFloat();

		agenda.armazenaPessoa(nome, idade, altura);
	}
	
	public static void main(String[] args) {
		int pergunta = 6;
		int respostaAgenda = 0;
		Agenda agenda = new Agenda();

		
		agenda.armazenaPessoa("Elias Junio", 22, 1.85f);
		agenda.removePessoa("elias junio");
		System.out.println(agenda.pessoas[0].getNome());
		
		Scanner teclado = new Scanner(System.in);
		do {
			
			System.out.println("1 - Armazenar pessoa \n2 - Remover pessoa \n3 - Buscar pessoa "
					+ "\n4 - Imprime agenda \n5 - Imprime pessoa \n6 - SAIR");
			System.out.print("Escolha uma opção: ");
			respostaAgenda = teclado.nextInt();
			
			switch (respostaAgenda) {
			case 1: {
				armazenaPessoa(agenda);
				break;
			}
			
			case 2: {
			}
			
			case 3: {
			}
			
			case 4: {
			}
			
			case 5: {
			}
			
			case 6: {
				System.out.println("Obrigado, volte sempre :)");
			}
			default:
				System.out.println("Opção invalida");
			}
			
		} while(pergunta != 6);
		
		
		teclado.close();
	}

}
