package br.com.zup.estrelas.fornecedoresempregados;

public class ControleFornecedorEmpregado {
	public static void main(String[] args) {
		Fornecedor elias = new Fornecedor("Elias Junio Borges", "Rua V. Justo", "34992454428", 0f);
		Fornecedor idinilson = new Fornecedor("Idinilson", "Rua Maria Moreira", "75992454428", 500f);
		Empregado gabriel = new Empregado("Gabriel Jesus", "Avenida Querubim", "11", 001, 2000f);
		Empregado dayana = new Empregado("Dayana", "George Street", "11", 001, 4500f);
		Administrador joao = new Administrador("João Gabriel", "Rua Sirius", "34", 002, 10000f, 500f);

		System.out.println("======= DADOS DOS FORNECEDORES =======");
		elias.imprimirFornecedor();
		idinilson.imprimirFornecedor();

		System.out.println("\n\n======= DADOS DOS EMPREGADOS =======");
		dayana.imprimeEmpregado();
		gabriel.imprimeEmpregado();
		
		System.out.println("\n\n======= DADOS DOS ADMINISTRADORES =======");
		joao.imprimeEmpregado();
	}

}