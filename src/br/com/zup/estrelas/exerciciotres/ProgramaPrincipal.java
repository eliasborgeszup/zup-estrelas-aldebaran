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
		int respostaAgenda = 0;
		int contador = 0;

		Agenda agenda = new Agenda();

		Scanner teclado = new Scanner(System.in);

		while (respostaAgenda != 6) {

			System.out.println("1 - Armazenar pessoa \n2 - Remover pessoa \n3 - Buscar pessoa "
					+ "\n4 - Imprime agenda \n5 - Imprime pessoa \n6 - SAIR");
			System.out.print("Escolha uma opção: ");
			respostaAgenda = teclado.nextInt();

			switch (respostaAgenda) {
			case 1: {
				if (contador < 10) {
					armazenaPessoa(agenda);
					contador++;
				} else {
					System.out.println("Você atingiu o limite maximo de pessoas");
				}
				break;
			}

			case 2: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					System.out.print("Digite o nome completo que deseja remover: ");
					String nome = teclado.nextLine();
					System.out.println(nome);
					agenda.removePessoa(nome);
				}
				break;
			}

			case 3: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
				System.out.print("Digite o nome completo que deseja buscar: ");
				String nome = teclado.nextLine();

				agenda.buscaPessoa(nome);
				}
				break;
			}

			case 4: {
				agenda.imprimeAgendas();
				break;
			}

			case 5: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
				System.out.print("Digite a posição da pessoa que deseja remover: ");
				int posicao = teclado.nextInt();

				agenda.imprimirPessoa(posicao);
				}
				break;
			}

			case 6: {
				System.out.println("Obrigado, volte sempre :)");
				break;
			}
			default:
				System.out.println("Opção invalida");
				break;
			}

		}

		teclado.close();
	}

}
