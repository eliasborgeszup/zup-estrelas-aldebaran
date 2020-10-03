package br.com.zup.estrelas.auladezesseis.bancozup;

import java.util.Scanner;

import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AdicionaSaldoCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteChequeClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.CadastrarClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.ClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteChequeClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.LimiteClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.RemoverClienteException;

public class ConsoleGerente {

	public static void menuPrincipal() {
		System.out.println("\t# Sistema De Gerenciamento de Clientes #\n");
		System.out.println("\t(1) - Cadastrar novo cliente;");
		System.out.println("\t(2) - Remover cliente;");
		System.out.println("\t(3) - Aumentar limite cartão;");
		System.out.println("\t(4) - Diminuir limite cartão;");
		System.out.println("\t(5) - Aumentar limite cheque especial;");
		System.out.println("\t(6) - Diminuir limite cheque especial;");
		System.out.println("\t(7) - Realizar transferência;");
		System.out.println("\t(8) - Realizar depósito;");
		System.out.println("\t(9) - Imprimir clientes;");
		System.out.println("\t(0) - Finalizar programa;\n");
		System.out.print("\n\n\tEscolha uma das opções acima: ");
	}

	public static void menuCadastrarCliente(Scanner teclado, Gerente gerente) {

		String opcao = null;

		do {
			System.out.println("\n\t(1) - Cadastrar pessoa física");
			System.out.println("\t(2) - Cadastrar pessoa jurídica");
			System.out.println("\t(0) - Ir para o menu principal\n");

			System.out.print("\n\tEscolha uma das opções acima: ");
			opcao = teclado.next();

			switch (opcao) {
			case "1":
				teclado.nextLine();
				System.out.print("\n\tDigite o nome do cliente: ");
				String nome = teclado.nextLine();

				System.out.print("\n\tDigite o CPF: ");
				String cpf = teclado.next();

				System.out.print("\n\tDigite a idade: ");
				int idade = teclado.nextInt();

				System.out.print("\n\tDigite o telefone do cliente: ");
				String telefone = teclado.next();

				System.out.print("\n\tDigite o numero da agencia: ");
				String agencia = teclado.next();

				System.out.print("\n\tDigite o numero da conta: ");
				String numeroDaConta = teclado.next();

				System.out.print("\n\tDigite o saldo inicial: ");
				double saldo = teclado.nextDouble();

				System.out.print("\n\tDigite o limite do cheque especial: ");
				double limiteChequeEspecial = teclado.nextDouble();

				System.out.print("\n\tDigite o limite do cartão de crédito: ");
				double limiteCartaoCredito = teclado.nextDouble();

				PessoaFisica pf = new PessoaFisica(numeroDaConta, telefone, agencia, saldo, limiteChequeEspecial,
						limiteCartaoCredito, cpf, nome, idade);
				try {
					gerente.cadastrarCliente(pf);
					System.out.printf("\n\tCliente[%s] cadastrado com sucesso!\n", pf.getNumeroConta());
				} catch (CadastrarClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "2":
				teclado.nextLine();
				System.out.print("\n\tDigite a razão social: ");
				String razaoSocial = teclado.nextLine();

				System.out.print("\n\tDigite o nome fantasia: ");
				String nomeFantasia = teclado.nextLine();

				System.out.print("\n\tDigite o CNPJ: ");
				String cnpj = teclado.nextLine();

				System.out.print("\n\tDigite o telefone do cliente: ");
				telefone = teclado.next();

				System.out.print("\n\tDigite o numero da agencia: ");
				agencia = teclado.next();

				System.out.print("\n\tDigite o numero da conta: ");
				numeroDaConta = teclado.next();

				System.out.print("\n\tDigite o saldo inicial: ");
				saldo = teclado.nextDouble();

				System.out.print("\n\tDigite o limite do cheque especial: ");
				limiteChequeEspecial = teclado.nextDouble();

				System.out.print("\n\tDigite o limite do cartão de crédito: ");
				limiteCartaoCredito = teclado.nextDouble();
				int qtdSocios = 0;

				do {
					System.out.print("\n\tQuantos socios deseja cadastrar: ");
					qtdSocios = teclado.nextInt();
					if (qtdSocios <= 0 && qtdSocios >= 4) {
						System.out.println("\n\tInclua de 1 a 3 sócios/\n");
					}
					teclado.nextLine();
				} while (qtdSocios <= 0 && qtdSocios >= 4);

				String[] nomesSocios = new String[qtdSocios];
				for (int i = 0; i < nomesSocios.length; i++) {
					System.out.printf("\n\tDigite o %d° nome: ", i + 1);
					nomesSocios[i] = teclado.nextLine();
				}

				PessoaJuridica pj = new PessoaJuridica(numeroDaConta, telefone, agencia, saldo, limiteChequeEspecial,
						limiteCartaoCredito, cnpj, razaoSocial, nomeFantasia, nomesSocios);

				try {
					gerente.cadastrarCliente(pj);
					System.out.printf("\n\tCliente[%s] cadastrado com sucesso!\n", pj.getNumeroConta());
				} catch (CadastrarClienteException e) {
					System.out.println(e.getMensagem());
				}

				break;

			case "0":
				break;

			default:
				System.out.println("\n\tOpção inválida. Por favor tente uma opção de 0 a 3.\n");
				break;
			}

		} while (!opcao.equals("0"));
	}

	public static String buscarNumeroConta(Scanner teclado, String tipoOperacao) {
		System.out.printf("\n\tDigite o número da conta que deseja %s: ", tipoOperacao);
		String numeroConta = teclado.next();
		return numeroConta;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Gerente gerente = new Gerente();
		String numeroConta;

		String opcao = null;

		do {
			menuPrincipal();
			opcao = teclado.next();

			switch (opcao) {
			case "1":
				menuCadastrarCliente(teclado, gerente);
				break;

			case "2":
				numeroConta = buscarNumeroConta(teclado, "excluir");

				try {
					gerente.removerCliente(numeroConta);
					System.out.printf("\n\tConta[%s] excluida com sucesso!\n", numeroConta);
				} catch (RemoverClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "3":
				numeroConta = buscarNumeroConta(teclado, "aumentar limite do cartão");

				try {
					gerente.aumentarLimiteCartao(numeroConta);
					System.out.printf("\n\tLimite da cartao[%s] aumentado com sucesso!\n", numeroConta);
				} catch (AumentarLimiteCartaoClienteException e) {
					System.out.println(e.getMensagem());
				}

				break;

			case "4":
				numeroConta = buscarNumeroConta(teclado, "reduzir limite do cartão");
				
				try {
					gerente.diminuirLimiteCartao(numeroConta);
					System.out.printf("\n\tLimite da cartao[%s] reduzido com sucesso!\n", numeroConta);
				} catch (DiminuirLimiteCartaoClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "5":
				numeroConta = buscarNumeroConta(teclado, "aumentar limite do cheque especial");

				try {
					gerente.aumentarLimiteCheque(numeroConta);
					System.out.printf("\n\tLimite do cheque especial[%s] aumentado com sucesso!\n", numeroConta);
				} catch (AumentarLimiteChequeClienteException e) {
					System.out.println(e.getMensagem());
				}

				break;

			case "6":
				numeroConta = buscarNumeroConta(teclado, "reduzir limite cheque especial");
				try {
					gerente.diminuirLimiteCheque(numeroConta);
					System.out.printf("\n\tLimite do cheque especial[%s] reduzido com sucesso!\n", numeroConta);
				} catch (DiminuirLimiteChequeClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "7":
				System.out.print("\n\tDigite o número da conta de origem: ");
				String numeroContaOrigem = teclado.next();

				System.out.print("\n\tDigite o número da conta de destino: ");
				String numeroContaDestino = teclado.next();

				System.out.print("\n\tDigite o valor a ser transferido: R$ ");
				double valorTransferencia = teclado.nextDouble();

				try {
					gerente.transferencia(numeroContaOrigem, numeroContaDestino, valorTransferencia);
					System.out.println("\n\tTransferência realizada com sucesso!\n");
				} catch (LimiteClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "8":

				System.out.print("\n\tDigite o número da conta de destino: ");
				numeroContaDestino = teclado.next();

				System.out.print("\n\tDigite o valor a ser depositado: ");
				double deposito = teclado.nextDouble();
				try {
					gerente.adicionaSaldo(numeroContaDestino, deposito);
					System.out.println("\n\tDeposito  na conta %s realizado com sucesso!\n");
				} catch (AdicionaSaldoCartaoClienteException e) {
					System.out.println(e.getMensagem());
				}
				break;

			case "9":
				try {
					gerente.imprimeClientes();
				} catch (ClienteException e) {
					System.out.println(e.getMensagem());
				}

				break;

			case "0":
				System.out.println("\n\tObrigado por usar o nosso sistema!\n");
				break;

			default:
				System.out.println("\n\tOpção inválida! Escolha uma opção de 0 a 9.\n");
				break;
			}

		} while (!opcao.equals("0"));
		teclado.close();
	}
}
