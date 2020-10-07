package br.com.zup.estrelas.aulavinteeum.exercicio.tres;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void armazenaPessoa(Agenda agenda, Scanner teclado) {
		teclado.nextLine();

		System.out.print("Digite o nome completo: ");
		String nome = teclado.nextLine();

		Integer idade = null;
		Float altura = null;
		do {
			try {
				System.out.print("Digite sua idade: ");
				idade = teclado.nextInt();
				teclado.nextLine();
				System.out.print("Digite sua altura: ");
				altura = teclado.nextFloat();
			} catch (InputMismatchException e) {
				// e.printStackTrace(); - Função fica na parte de log
				System.err.println("Ops... você digitou caracteres, digite apenas numero.");
			}
		} while (idade == null || altura == null);

		try {
			agenda.armazenaPessoa(nome, idade, altura);
		} catch (AgendaException e) {
			System.out.println(e.getMensagem());
		}

	}

	public static void main(String[] args) throws IOException {
		int respostaAgenda = 0;
		int contador = 0;

		Agenda agenda = new Agenda();

		Scanner teclado = new Scanner(System.in);
		while (respostaAgenda != 7) {

			System.out.println("\n1 - Armazenar pessoa \n2 - Remover pessoa \n3 - Buscar pessoa "
					+ "\n4 - Imprime agenda \n5 - Imprime pessoa \n6 - Criar arquivo com agenda" + "\n7 - SAIR");
			System.out.print("Escolha uma opção: ");
			respostaAgenda = teclado.nextInt();

			switch (respostaAgenda) {
			case 1: {
				try {
					armazenaPessoa(agenda, teclado);
					contador++;
				} catch (Exception e) {
					System.out.println("\nInfelizmente não foi possivel armazenar a Pessoa, tente novamente");
				}
				break;
			}

			case 2: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					teclado.nextLine();
					System.out.print("Digite o nome completo que deseja remover: ");
					String nome = teclado.nextLine();

					try {
						agenda.removePessoa(nome);
					} catch (AgendaException e) {
						System.out.println(e.getMensagem());
					}

					System.out.println(nome + " removido com sucesso");
				}
				break;
			}

			case 3: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					teclado.nextLine();
					System.out.print("Digite o nome completo que deseja buscar: ");
					String nome = teclado.nextLine();

					System.out.println("Esta na posição: " + agenda.buscaPessoa(nome));
				}
				break;
			}

			case 4: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					agenda.imprimeAgendas();
				}
				break;
			}

			case 5: {
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					System.out.print("Digite a posição da pessoa que deseja imprimir: ");
					int posicao = teclado.nextInt();

					agenda.imprimirPessoa(posicao);
				}
				break;
			}
			case 6:
				if (contador < 1) {
					System.out.println("Agenda Vazia");
				} else {
					System.out.print("Digite o nome do arquivo para agenda: ");
					String nomeArquivo = teclado.next();
					agenda.criarArquivo(nomeArquivo);
				}

				break;
			case 7: {
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
