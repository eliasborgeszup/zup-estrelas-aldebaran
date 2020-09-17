package br.com.zup.estrelas.exerciciotres;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Agenda {
	Pessoa[] pessoas = new Pessoa[10];
	
	int contadorPessoa = 0;
	
	public void armazenaPessoa(String nome, int idade, float altura) {	
		if (contadorPessoa < 10) {
			pessoas[contadorPessoa] = new Pessoa();

			pessoas[contadorPessoa].setNome(nome);
			pessoas[contadorPessoa].setIdade(idade);
			pessoas[contadorPessoa].setAltura(altura);

			contadorPessoa++;

		} else {
			System.out.println("Você atingiu o limite maximo");
		}
	}

	public void removePessoa(String nome) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				String nomeConvertidoString = String.valueOf(pessoas[i].getNome());
				
				if (collator.compare(nomeConvertidoString, nome) == 0) {
					pessoas[i].setNome(null);
					pessoas[i].setIdade(0);
					pessoas[i].setAltura(0);
					contadorPessoa--;
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

				if (collator.compare(nomeConvertidoString, nome) == 0) {
					return i;
				}
			}

		}

		return -1;
	}

	public void imprimeAgendas() {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				System.out.printf("Nome: %s", pessoas[i].getNome());
				System.out.printf("\nIdade: %d", pessoas[i].getIdade());
				System.out.printf("\nAltura: %.2f\n\n", pessoas[i].getAltura());
			}
		}
	}

	public void imprimirPessoa(int posicao) {
		if (pessoas[posicao] != null) {
			System.out.printf("Nome: %s", pessoas[posicao].getNome());
			System.out.printf("\nIdade: %d", pessoas[posicao].getIdade());
			System.out.printf("\nAltura: %.2f\n\n", pessoas[posicao].getAltura());
		}

	}
}
