package br.com.zup.estrelas.fornecedoresempregados;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float percentualImposto;

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase) {
		super(nome, endereco, telefone);

		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.percentualImposto = 1.1f;
	}

	public float calcularSalario() {
		float salarioCalculado, calculoImposto;

		calculoImposto = (this.salarioBase * this.percentualImposto) - this.salarioBase;

		salarioCalculado = this.salarioBase - calculoImposto;

		return salarioCalculado;
	}

	public void imprimeEmpregado() {
		System.out.printf("Nome: %s | Setor: %d", super.getNome(), this.codigoSetor);
		System.out.printf("\nEndereço: %s", super.getEndereco());
		System.out.printf("\nTelefone: %s", super.getTelefone());
		System.out.printf("\nSalario bruto: R$ %.2f", this.salarioBase);
		System.out.printf("\nSalario liquido: R$ %.2f", this.calcularSalario());
		System.out.println("\n====================================");
	}

	public float getSalarioBase() {
		return this.salarioBase;
	}

	public float getPercentualImposto() {
		return this.percentualImposto;
	}

	public int getCodigoSetor() {
		return this.codigoSetor;
	}
}
