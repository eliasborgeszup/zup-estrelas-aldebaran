package br.com.zup.estrelas.fornecedoresempregados;

public class Administrador extends Empregado{
	private float ajudaCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float ajudaCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase);
		this.ajudaCusto = ajudaCusto;
	}

	@Override
	public float calcularSalario() {
		float salarioAdministrador, calculoImposto; 
		float salarioBrutoMaisAjudaCusta = super.getSalarioBase() + this.ajudaCusto;
		
		calculoImposto = (salarioBrutoMaisAjudaCusta * super.getPercentualImposto()) - salarioBrutoMaisAjudaCusta;
		
		salarioAdministrador = salarioBrutoMaisAjudaCusta - calculoImposto; 
		
		return salarioAdministrador;	
	}	
	
	public void imprimeEmpregado() {
		System.out.printf("Nome: %s | Setor: %d", super.getNome(), super.getCodigoSetor());
		System.out.printf("\nEndereço: %s", super.getEndereco());
		System.out.printf("\nTelefone: %s", super.getTelefone());
		System.out.printf("\nSalario bruto: R$ %.2f"
				+ "\nAjuda de Custo: R$ %.2f "
				+ "\nTotal salario bruto: R$ %.2f", super.getSalarioBase(), this.ajudaCusto, super.getSalarioBase() + this.ajudaCusto);
		System.out.printf("\nSalario liquido: R$ %.2f", this.calcularSalario());
		System.out.println("\n======================================");
	}
}
