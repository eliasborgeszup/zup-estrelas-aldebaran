package br.com.zup.estrelas.exerciciotres;

import java.util.Scanner;

public class Agenda {
	Pessoa[] pessoas = new Pessoa[10];

	public void armazenaPessoa(String nome, int idade, float altura) {
		Scanner teclado = new Scanner(System.in);
		int contadorPessoas = 0;
		
		System.out.print("Digite o nome completo:");
		pessoas[contadorPessoas].setNome(teclado.nextLine());
		
		System.out.print("Digite o ano de nascimento: ");
		pessoas[contadorPessoas].setAnoNascimento(teclado.nextInt());
		
		System.out.println("Digite sua altura: ");
		pessoas[contadorPessoas].setAnoNascimento(teclado.nextInt());
		
		contadorPessoas++;
		teclado.close();
	}
}
