package br.com.zup.estrelas.auladezesseis.exercicioum;

/*
 * Crie uma classe denominada Elevador para armazenar as informa��es de um
 * elevador dentro de um pr�dio. A classe deve armazenar o andar atual (t�rreo =
 * 0), total de andares no pr�dio (desconsiderando o t�rreo), capacidade do
 * elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
 * disponibilizar os seguintes m�todos: Entra : para acrescentar uma pessoa no
 * elevador (s� deve acrescentar se ainda houver espa�o); Sai : para remover uma
 * pessoa do elevador (s� deve remover se houver algu�m dentro dele); Sobe :
 * para subir um andar (n�o deve subir se j� estiver no �ltimo andar); Desce :
 * para descer um andar (n�o deve descer se j� estiver no t�rreo);
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
			System.out.println("Andar atual �: " + elevador.getAndarAtual());
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
			System.out.println("Andar atual �: " + elevador.getAndarAtual());
			System.out.printf("Possui %s pessoas dentro", elevador.getQuantidadePessoasPresente());
		} catch (ControleAndarException e) {
			System.out.println(e.getMensagem());
		}

		try {
			elevador.sobe(20);
			System.out.println("Andar atual �: " + elevador.getAndarAtual());
			System.out.printf("Possui %s pessoas dentro", elevador.getQuantidadePessoasPresente());
		} catch (ControleAndarException e) {
			System.out.println(e.getMensagem());
		}

	}

}
