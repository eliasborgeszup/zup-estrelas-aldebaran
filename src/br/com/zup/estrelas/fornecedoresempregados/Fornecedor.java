package br.com.zup.estrelas.fornecedoresempregados;

public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;

	public Fornecedor(String nome, String endereco, String telefone, float valorDivida) {
		super(nome, endereco, telefone);
		
		this.valorDivida = valorDivida;
		this.valorCredito = 10000;
	}

	public String obterSaldo() {
		float saldo;
		if (this.valorCredito >= this.valorDivida) {
			saldo = this.valorCredito - this.valorDivida;
			return "Você possui um saldo de: R$" + saldo;
		} else {
			saldo = this.valorCredito - this.valorDivida;
			return "Você possui uma divida de: R$" + saldo;
		}

	}
}
