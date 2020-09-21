package br.com.zup.estrelas.fornecedoresempregados;

public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, float valorDivida) {
		super(nome, endereco, telefone);

		this.valorCredito = 10000;
		if (valorDivida <= this.valorCredito) {
			this.valorDivida = valorDivida;
		}
	}

	public float obterSaldo() {
		float saldoDisponivel;

		saldoDisponivel = this.valorCredito - this.valorDivida;
		return saldoDisponivel;
	}

	public void imprimirFornecedor() {
		System.out.printf("Nome: %s", super.getNome());
		System.out.printf("\nEndereço: %s", super.getEndereco());
		System.out.printf("\nTelefone: %s", super.getTelefone());
		if (this.valorDivida > 0) {
			System.out.printf("\nDivida: %.2f", this.valorDivida);
		}
		System.out.printf("\nCredito disponivel: %.2f", this.valorCredito);
		if (this.obterSaldo() < this.valorCredito) {
			System.out.printf("\nSaldo disponivel: %.2f", this.obterSaldo());
		}
		System.out.println("\n======================================");
	}

}
