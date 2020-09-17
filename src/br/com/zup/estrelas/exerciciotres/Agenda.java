package br.com.zup.estrelas.exerciciotres;

import java.text.Collator;
import java.util.Arrays;

public class Agenda {
	Pessoa[] pessoas = new Pessoa[10];
	
	int contadorPessoas = 0;

	public void armazenaPessoa(String nome, int idade, float altura) {
		if(contadorPessoas < 10) {
			pessoas[contadorPessoas] = new Pessoa();
			
			pessoas[contadorPessoas].setNome(nome);
			pessoas[contadorPessoas].setIdade(idade);
			pessoas[contadorPessoas].setAltura(altura);
			contadorPessoas += 1;
		}
	}
	
	public void removePessoa(String nome) {
		Collator collator = Collator.getInstance();
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();
			
			String nomeConvertidoString = String.valueOf(pessoas[i].getNome());
			
			if(collator.compare(nomeConvertidoString, nome) == 0) {
				pessoas[i].setNome(null);
				pessoas[i].setIdade(0);
				pessoas[i].setAltura(0);
			}
		}
	}
	
}
