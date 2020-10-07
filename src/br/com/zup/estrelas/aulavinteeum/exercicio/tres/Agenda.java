package br.com.zup.estrelas.aulavinteeum.exercicio.tres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

public class Agenda {
	public static final int QUANTIDADE_PESSOAS_ADICIONADAS = 10;
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static int contadorPessoa = 0;

	public void armazenaPessoa(String nome, int idade, float altura) throws AgendaException {
		Pessoa pessoa = new Pessoa(nome, idade, altura);

		if (this.pessoas.size() < QUANTIDADE_PESSOAS_ADICIONADAS) {
			pessoas.add(pessoa);
			return;
		}
		throw new AgendaException("Você atingiu o maximo de pessoas adicionadas");
	}

	public void removePessoa(String nome) throws AgendaException {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		Integer indiceRemocao = null;
		for (int i = 0; i < this.pessoas.size(); i++) {
			if (collator.compare(this.pessoas.get(i).getNome(), nome) == 0) {
				indiceRemocao = i;
				break;
			}
		}

		if (indiceRemocao != null) {
			pessoas.remove(pessoas.get(indiceRemocao));
			return;
		}
		
		throw new AgendaException("Não foi possivel excluir, tente novamente");

	}

	public int buscaPessoa(String nome) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i) != null) {
				String nomeConvertidoString = String.valueOf(this.pessoas.get(i).getNome());

				if (collator.compare(nomeConvertidoString, nome) == 0) {
					return i;
				}
			}

		}

		return -1;
	}

	public void imprimeAgendas() {	
		for (Pessoa pessoa : pessoas) {
			System.out.printf("Nome: %s", pessoa.getNome());
			System.out.printf("\nIdade: %d", pessoa.getIdade());
			System.out.printf("\nAltura: %.2f\n\n", pessoa.getAltura());
		}
	}

	public void criarArquivo(String nomeArquivo) throws IOException {
		nomeArquivo += ".txt";
		//File file = new File("Y:\\" + nomeArquivo);
		File file = new File(nomeArquivo);

		FileWriter writer = new FileWriter(nomeArquivo, true);

		try {
			file.createNewFile();

			System.out.printf("Arquivo %s criado com sucesso", nomeArquivo);
			
			for (Pessoa pessoa : pessoas) {
				writer.append("\nNome: " + pessoa.getNome());
				writer.append("\nIdade: " + pessoa.getIdade());
				writer.append("\nAltura: " + pessoa.getAltura());
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			// Executado ate mesmo com retorno no try
			writer.close();
		}

	}

	public void imprimirPessoa(int posicao) {
		if (this.pessoas.get(posicao) != null) {
			System.out.printf("Nome: %s", this.pessoas.get(posicao).getNome());
			System.out.printf("\nIdade: %d", this.pessoas.get(posicao).getIdade());
			System.out.printf("\nAltura: %.2f\n\n", this.pessoas.get(posicao).getAltura());
		}
	}
}
