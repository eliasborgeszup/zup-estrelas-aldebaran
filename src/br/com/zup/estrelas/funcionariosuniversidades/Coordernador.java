package br.com.zup.estrelas.funcionariosuniversidades;

public class Coordernador extends Funcionario{
	
	private Professor[] professoresSupervisionados;
	
	public Coordernador(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario, Professor[] professoresSupervisionados) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		
		this.professoresSupervisionados = professoresSupervisionados;
	}

}
