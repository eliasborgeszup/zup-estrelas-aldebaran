package br.com.zup.estrelas.exerciciotres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.Locale;

	public class Agenda {

	Pessoa[] pessoas = new Pessoa[Pessoa.QUANTIDADE_PESSOAS_ADICIONADAS];

	public static int contadorPessoa = 0;

	public void armazenaPessoa(String nome, int idade, float altura) {
		pessoas[contadorPessoa] = new Pessoa();
		pessoas[contadorPessoa].setNome(nome);
		pessoas[contadorPessoa].setIdade(idade);
		pessoas[contadorPessoa].setAltura(altura);

		contadorPessoa++;
	}

	public void removePessoa(String nome) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null && collator.compare(pessoas[i].getNome(), nome) == 0) {
					pessoas[i] = null;
					contadorPessoa--;
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

	public void criarArquivo(String nomeArquivo) throws IOException {
		nomeArquivo += ".txt";
		File file = new File("Y:\\" + nomeArquivo);
		//File file = new File(nomeArquivo);
		
		FileWriter writer = new FileWriter(nomeArquivo, true);

		try {
			file.createNewFile();

			System.out.printf("Arquivo %s criado com sucesso", nomeArquivo);

			for (int i = 0; i < pessoas.length; i++) {
				if (pessoas[i] != null) {
					writer.append("\nNome: " + pessoas[i].getNome());
					writer.append("\nIdade: " + pessoas[i].getIdade());
					writer.append("\nAltura: " + pessoas[i].getAltura());
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			//Executado ate mesmo com retorno no try
			writer.close();
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
