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

		
		agenda.armazenaPessoa("Elias Junio 01", 22, 1.85f);
		agenda.armazenaPessoa("Elias Junio", 23, 1.86f);
		agenda.armazenaPessoa("Elias Junio", 24, 1.87f);
		agenda.armazenaPessoa("Elias Junio 04", 25, 1.88f);
		
		agenda.imprimirPessoas();

		System.out.println(agenda.pessoas[1].getNome());
		
		System.out.println("Posição: " + agenda.buscaPessoa("elias Junio"));
		agenda.removePessoa("elias junio");
		agenda.removePessoa("elias junio");
		
		if (agenda.buscaPessoa("elias das") == -1) {
			System.out.println("Não foi possivel localizar");
		}
		

		System.out.println(agenda.pessoas[0].getNome());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		while(pergunta != 6) {
			
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
			
		}
		
		
		teclado.close();
	}

}
