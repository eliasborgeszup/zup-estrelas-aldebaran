package br.com.zup.estrelas.aulavinteeum.exercicio.quatro;

import java.util.Scanner;

public class ProgramaPrincipal {

	private static final String MENSAGEM_BEM_VINDO = ("======== SEJA BEM VINDO AO SISTEMA VELOE ========\n")
			+ ("                Piscou, passou ;)\n\n\n\n");

	private static final String MENU = ("\n\n\n\n1 - Registrar entrada\n") + ("2 - Registrar saida\n")
			+ ("3 - Alterar capacidade maxima do estacionamento\n") + ("4 - Imprimir saldo\n")
			+ ("5 - Imprimir carros presentes\n") + ("0 - SAIR\n");

	public static void registrarEntradaCarro(Scanner teclado, Estacionamento estacionamento) {
		teclado.nextLine();
		System.out.print("Digite o numero da placa do veiculo: ");
		String placa = teclado.nextLine();

		while (estacionamento.carroPresente(placa)) {
			System.out.print("Numero da placa do veiculo já esta cadastrada, digite novamente: ");
			placa = teclado.nextLine();
		}

		System.out.print("Digite a cor do veiculo: ");
		String cor = teclado.nextLine();

		System.out.print("Digite a marca do veiculo: ");
		String marca = teclado.nextLine();

		System.out.print("Digite o modelo do veiculo: ");
		String modelo = teclado.nextLine();

		Carro carro = new Carro(placa, cor, marca, modelo);
		try {
			estacionamento.registraEntrada(carro);
			System.out.printf("[%s] - Entrada registrada com sucesso\n", placa);
		} catch (EstacionamentoException e) {
			System.out.println(e.getMensagem());
		}
	}

	public static void registrarSaidaCarro(Scanner teclado, Estacionamento estacionamento)
			throws EstacionamentoException {
		teclado.nextLine();

		System.out.print("Digite o numero da placa: ");
		String placa = teclado.nextLine();

		System.out.print("Digite o valor em R$ da estadia: ");
		float valorEstadia = teclado.nextFloat();
		try {
			estacionamento.registraSaida(placa, valorEstadia);
			System.out.printf("[%s] - Saida registrada com sucesso\n", placa);
		} catch (EstacionamentoException e) {
			System.out.println(e.getMensagem());
		}
	}

	public static void main(String[] args) throws EstacionamentoException {
		Scanner teclado = new Scanner(System.in);

		System.out.println(MENSAGEM_BEM_VINDO);

		System.out.print("Qual a capacidade maxima do estacionamento: ");
		int capacidadeEstacionamento = teclado.nextInt();
		Estacionamento estacionamento = new Estacionamento(capacidadeEstacionamento);

		int opcao = 0;

		do {
			System.out.println(MENU);

			System.out.println("Digite uma das opções: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				registrarEntradaCarro(teclado, estacionamento);
				break;

			case 2:
				registrarSaidaCarro(teclado, estacionamento);
				break;

			case 3:
				System.out.print("Digite a nova capacidade maxima: ");
				int capacidadeMaxima = teclado.nextInt();

				estacionamento.atualizaCapacidadeMaxima(capacidadeMaxima);
				break;

			case 4:
				System.out.println("Saldo: R$" + estacionamento.imprimeSaldo());
				break;

			case 5:
				estacionamento.imprimirCarros();
				break;

			case 0:
				System.out.println("Volte sempre :)");
				break;
			default:
				System.out.println("Opção invalida!");
			}
		} while (opcao != 0);

		teclado.close();
	}

}
