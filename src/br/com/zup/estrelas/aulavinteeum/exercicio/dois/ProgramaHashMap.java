package br.com.zup.estrelas.aulavinteeum.exercicio.dois;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramaHashMap {
	/*
	 * public static void imprimirPessoas(Map<String, String>) { for (String
	 * dadoPessoa : dadosPessoas.values()) { System.out.print(dadoPessoa + " "); } }
	 */
	 
	public static void main(String[] args) {
		Map<String, String> dadosPessoas = new HashMap<String, String>();
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {		
			System.out.print("Digite seu CPF: ");
			String cpf = teclado.nextLine();
			
			System.out.print("Digite seu nome: ");
			String nome = teclado.nextLine();
			
			dadosPessoas.put(cpf, nome);
		}
		
		System.out.println(dadosPessoas);
		
		for (String dadoPessoa : dadosPessoas.values()) {
			System.out.print(dadoPessoa + " ");		
		}
		
		
		System.out.print("\nDigite um CPF que deseja remover: ");
		String cpfRemover = teclado.nextLine();	
		
		dadosPessoas.remove(cpfRemover);
		
		System.out.println(dadosPessoas);
		
		teclado.close();
	}

}
