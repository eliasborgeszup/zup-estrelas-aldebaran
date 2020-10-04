package br.com.zup.estrelas.auladezesseis.bancozup;

import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AdicionaSaldoCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteChequeClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.CadastrarClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.ClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteChequeClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.LimiteClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.RemoverClienteException;

public class Gerente implements IControleLimite {
	private final int NUMERO_MAXIMO_CLIENTES = 20;
	private final float PORCENTUAL_AUMENTO_LIMITE_CHEQUE = 1.15F;
	private final float PORCENTUAL_AUMENTO_CARTAO_CREDITO = 1.10F;
	private final float PORCENTUAL_DIMINUICAO_LIMITE_CHEQUE = 0.85F;
	private final float PORCENTUAL_DIMINUICAO_CARTAO_CREDITO = 0.90F;

	private Cliente[] clientes;

	public Gerente() {
		this.clientes = new Cliente[NUMERO_MAXIMO_CLIENTES];
	}

	public void cadastrarCliente(Cliente cliente) throws CadastrarClienteException {
		for (int i = 0; i < this.clientes.length; i++) {
			if (this.clientes[i] == null) {
				this.clientes[i] = cliente;
				return;
			}
		}

		throw new CadastrarClienteException("\n\tInfelizmente você atingiu o limite maximo de clientes cadastrado!\n");
	}

	public void removerCliente(String numeroConta) throws RemoverClienteException {
		for (int i = 0; i < this.clientes.length; i++) {
			if (this.clientes[i] != null && this.clientes[i].getNumeroConta().equals(numeroConta)) {
				this.clientes[i] = null;
				return;
			}
		}
		throw new RemoverClienteException(String.format("\n\tConta[%s] não localizada!\n", numeroConta));
	}

	@Override
	public void aumentarLimiteCheque(String numeroConta) throws AumentarLimiteChequeClienteException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteChequeEspecial(
						clientes[i].getLimiteChequeEspecial() * PORCENTUAL_AUMENTO_LIMITE_CHEQUE);
				return;
			}
		}
		throw new AumentarLimiteChequeClienteException(
				String.format("\n\tNúmero da conta[%s] inexistente\n", numeroConta));
	}

	@Override
	public void aumentarLimiteCartao(String numeroConta) throws AumentarLimiteCartaoClienteException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteCartaoCredito(
						clientes[i].getLimiteCartaoCredito() * PORCENTUAL_AUMENTO_CARTAO_CREDITO);
				return;
			}
		}
		throw new AumentarLimiteCartaoClienteException(
				String.format("\n\tNúmero da conta[%s] inexistente!\n", numeroConta));
	}

	@Override
	public void diminuirLimiteCheque(String numeroConta) throws DiminuirLimiteChequeClienteException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteChequeEspecial(
						clientes[i].getLimiteChequeEspecial() * PORCENTUAL_DIMINUICAO_LIMITE_CHEQUE);
				return;
			}
		}
		throw new DiminuirLimiteChequeClienteException(
				String.format("\n\tNúmero da conta[%s] inexistente!\n", numeroConta));
	}

	@Override
	public void diminuirLimiteCartao(String numeroConta) throws DiminuirLimiteCartaoClienteException {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setLimiteCartaoCredito(
						clientes[i].getLimiteCartaoCredito() * PORCENTUAL_DIMINUICAO_CARTAO_CREDITO);
				return;
			}
		}
		throw new DiminuirLimiteCartaoClienteException(
				String.format("\n\tNúmero da conta[%s] inexistente!\n", numeroConta));
	}

	public boolean verificaExistenciaConta(String numeroConta) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				return true;
			}
		}

		return false;
	}

	public void transferencia(String numeroContaOrigem, String numeroContaDestino, double valorTransferencia)
			throws LimiteClienteException {
		boolean verificaExistenciaContaOrigem, verificaExistenciaContaDestion;

		if (!numeroContaOrigem.equals(numeroContaDestino)) {
			verificaExistenciaContaOrigem = verificaExistenciaConta(numeroContaOrigem);
			verificaExistenciaContaDestion = verificaExistenciaConta(numeroContaDestino);
		} else {
			throw new LimiteClienteException("\n\t[Contas iguais] Não foi possivel realizar a transferencia\n");
		}

		if (verificaExistenciaContaOrigem && verificaExistenciaContaDestion) {
			// Debitando Saldo da conta origem;
			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroContaOrigem)) {
					if (clientes[i].getSaldo() < valorTransferencia) {
						throw new LimiteClienteException(
								"\n\t[Saldo insuficiente] Não foi possivel realizar a transferencia\n");
					} else {
						clientes[i].setSaldo(clientes[i].getSaldo() - valorTransferencia);
						break;
					}
				}
			}

			// Creditando Saldo na Conta Destino;

			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroContaDestino)) {
					clientes[i].setSaldo(clientes[i].getSaldo() + valorTransferencia);
					break;
				}

			}
		} else {
			throw new LimiteClienteException("\n\t Não foi possivel realizar a transferencia, tente novamente\n");
		}
	}

	/*
	 * public boolean transferencia(String numeroContaOrigem, String
	 * numeroContaDestino, double valorTransferencia) throws LimiteClienteException
	 * {
	 * 
	 * int aux = 0; int contaDestinoExistente = 0, contaOrigemExistente = 0;
	 * 
	 * if (!numeroContaOrigem.equals(numeroContaDestino)) { // Debitando Saldo da
	 * conta origem; for (int i = 0; i < clientes.length; i++) { if (clientes[i] !=
	 * null && clientes[i].getNumeroConta().equals(numeroContaOrigem)) { if
	 * (clientes[i].getSaldo() >= valorTransferencia) {
	 * clientes[i].setSaldo(clientes[i].getSaldo() - valorTransferencia);
	 * contaOrigemExistente = 1; aux = i; break; } } }
	 * 
	 * // Creditando Saldo na Conta Destino; if (contaOrigemExistente == 1) { for
	 * (int i = 0; i < clientes.length; i++) { if (clientes[i] != null &&
	 * clientes[i].getNumeroConta().equals(numeroContaDestino)) {
	 * clientes[i].setSaldo(clientes[i].getSaldo() + valorTransferencia);
	 * contaDestinoExistente = 1; } } }
	 * 
	 * if (contaOrigemExistente == 1 && contaDestinoExistente != 1) {
	 * clientes[aux].setSaldo(clientes[aux].getSaldo() + valorTransferencia); throw
	 * new LimiteClienteException(
	 * String.format("\n\tNúmero da conta[%s] destino não existe\n",
	 * numeroContaDestino)); }
	 * 
	 * if (contaOrigemExistente == 1 && contaDestinoExistente == 1) { return true; }
	 * else { throw new
	 * LimiteClienteException("\n\tNão foi possivel realizar a transferencia\n"); }
	 * 
	 * } throw new
	 * LimiteClienteException("\n\tNão foi possivel realizar a transferencia, contas iguais\n"
	 * ); }
	 */

	public void adicionaSaldo(String numeroConta, double deposito) throws AdicionaSaldoCartaoClienteException {

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getNumeroConta().equals(numeroConta)) {
				clientes[i].setSaldo(clientes[i].getSaldo() + deposito);
				return;
			}
		}

		throw new AdicionaSaldoCartaoClienteException(
				String.format("\n\tNúmero da conta[%s] inexistente!\n", numeroConta));
	}

	public void imprimeClientes() throws ClienteException {
		int contador = 0;
		for (Cliente cliente : clientes) {
			if (cliente != null) {
				/*
				 * if(cliente instanceof PessoaFisica) { PessoaFisica pessoaFisica =
				 * (PessoaFisica) cliente; pessoaFisica.imprimeDados(); }
				 */

				cliente.imprimeDados();
				contador = 1;
			}
		}

		if (contador != 1) {
			throw new ClienteException("\n\tNão possui nenhum cliente cadastrado!\n");
		}
	}
}