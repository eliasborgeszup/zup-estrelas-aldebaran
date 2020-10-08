package br.com.zup.estrelas.aulavinteeum.exercicio.quatro;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
	private float valorEmCaixa;
	private int capacidadeMaxima;

	Map<String, Carro> mapCarros = new HashMap<String, Carro>();

	public Estacionamento(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
		this.valorEmCaixa = 0;
	}

	public void registraEntrada(Carro carro) throws EstacionamentoException {
		if (this.mapCarros.size() < this.capacidadeMaxima) {
			mapCarros.put(carro.getPlaca(), carro);
			return;
		}
		throw new EstacionamentoException("Estacionamento cheio, por favor aguarde um momento!");
	}

	public void registraSaida(String placa, float valorEstadia) throws EstacionamentoException {
		if (mapCarros.get(placa) != null) {
			mapCarros.remove(placa);
			this.valorEmCaixa += valorEstadia;
			return;
		}
		throw new EstacionamentoException(String.format("Placa [%s] invalida, tente novamente!", placa));
	}

	public float imprimeSaldo() {
		return this.valorEmCaixa;
	}
	
	public void imprimirCarros() {
		System.out.println("Capacidade total do estacionamento: " + this.capacidadeMaxima);
		System.out.println("Quantidade de vagas restantes: " + (this.capacidadeMaxima - mapCarros.size()));
		
		for (Carro mapCarro : mapCarros.values()) {
			System.out.println("\nPlaca: "+ mapCarro.getPlaca());
			System.out.println("Cor: "+ mapCarro.getCor());
			System.out.println("Marca: "+ mapCarro.getMarca());
			System.out.println("Modelo: "+ mapCarro.getModelo());
			System.out.println("----------------------");
		}
	}
	
	public boolean carroPresente(String placa){
		if (mapCarros.get(placa) != null) {
			return true;
		}
		return false;
		//throw new EstacionamentoException(String.format("Carro com placa [%s], não esta no estacionamento", placa));
	}
	
	public void atualizaCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

}
