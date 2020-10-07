package br.com.zup.estrelas.aulavinteeum.exercicio.um;

import java.util.ArrayList;
import java.util.List;

public class ProgramaArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		
		String amarelo = "Amarelo";
		String azul = "Azul";
		String preto = "Preto";
		
		cores.add(amarelo);
		cores.add(azul);
		cores.add(preto);
		
		System.out.println(cores);
		
		/*
		 * for (String cor : cores) { System.out.println(cor); }
		 */
	}

}
