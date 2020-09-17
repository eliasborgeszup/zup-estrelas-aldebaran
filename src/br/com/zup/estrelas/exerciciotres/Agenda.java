package br.com.zup.estrelas.exerciciotres;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Agenda {
	Pessoa[] pessoas = new Pessoa[9];

	int contadorPessoa = 0;

	public void armazenaPessoa(String nome, int idade, float altura) {
		if (contadorPessoa < 10) {
			pessoas[contadorPessoa] = new Pessoa();

			pessoas[contadorPessoa].setNome(nome);
			pessoas[contadorPessoa].setIdade(idade);
			pessoas[contadorPessoa].setAltura(altura);
			contadorPessoa += 1;
		}
	}

	public void imprimirPessoas() {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				System.out.printf("Nome: %s", pessoas[i].getNome());
				System.out.printf("\nIdade: %d", pessoas[i].getIdade());
				System.out.printf("\nAltura: %.2f\n\n", pessoas[i].getAltura());
			}
		}
	}

	public void removePessoa(String nome) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);
		
		contadorPessoa = 0;
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				String nomeConvertidoString = String.valueOf(pessoas[i].getNome());

				if (collator.compare(nomeConvertidoString, nome) == 0) {
					pessoas[i].setNome(null);
					pessoas[i].setIdade(0);
					pessoas[i].setAltura(0);
				}
			}
		}
	}

	public int buscaPessoa(String nome) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				String nomeConvertidoString = String.valueOf(pessoas[i].getNome());
				
				System.out.println("01 "+ collator.compare(nomeConvertidoString, nome));
				
				if (collator.compare(nomeConvertidoString, nome) == 0) {
					return i;
				}
			}

		}

		return -1;
	}
}
