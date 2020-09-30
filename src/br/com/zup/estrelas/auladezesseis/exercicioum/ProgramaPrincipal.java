package br.com.zup.estrelas.auladezesseis.exercicioum;

/*
 * Crie uma classe denominada Elevador para armazenar as informações de um
 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
 * elevador e quantas pessoas estão presentes nele. A classe deve também
 * disponibilizar os seguintes métodos: Entra : para acrescentar uma pessoa no
 * elevador (só deve acrescentar se ainda houver espaço); Sai : para remover uma
 * pessoa do elevador (só deve remover se houver alguém dentro dele); Sobe :
 * para subir um andar (não deve subir se já estiver no último andar); Desce :
 * para descer um andar (não deve descer se já estiver no térreo);
 */
public class ProgramaPrincipal {

	public static void entra(Elevador elevador) throws ElevadorException{
		try {
			elevador.entra();
			System.out.println("Entrou uma pessoa, total de pessoas: " + elevador.getQuantidadePessoasPresente());
		} catch (CargaException e) {
			System.out.println(e.getMensagem());
			e.getStackTrace();
		}
	}

	public static void sai(Elevador elevador) throws ElevadorException{
		try {
			elevador.sai();
			System.out.println("Saiu uma pessoa, total de pessoas: " + elevador.getQuantidadePessoasPresente());
		} catch (CargaException e) {
			System.out.println(e.getMensagem());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ElevadorException {
		Elevador elevador = new Elevador(10, 2);

		elevador.setQuantidadePessoasPresente(10);

		entra(elevador);

		elevador.setQuantidadePessoasPresente(0);

		sai(elevador);

		entra(elevador);
		entra(elevador);
		

		try {
			elevador.sobe(2);
			System.out.println("Andar atual é: " + elevador.getAndarAtual());
			System.out.printf("Possui %s pessoas dentro", elevador.getQuantidadePessoasPresente());
		} catch (ControleAndarException e) {
			System.out.println(e.getMensagem());
		}
		sai(elevador);
		entra(elevador);
		entra(elevador);
		entra(elevador);
		sai(elevador);
		sai(elevador);

		try {
			elevador.desce(3);
			System.out.println("Andar atual é: " + elevador.getAndarAtual());
			System.out.printf("Possui %s pessoas dentro", elevador.getQuantidadePessoasPresente());
		} catch (ControleAndarException e) {
			System.out.println(e.getMensagem());
		}

		try {
			elevador.sobe(20);
			System.out.println("Andar atual é: " + elevador.getAndarAtual());
			System.out.printf("Possui %s pessoas dentro", elevador.getQuantidadePessoasPresente());
		} catch (ControleAndarException e) {
			System.out.println(e.getMensagem());
		}

	}

}
