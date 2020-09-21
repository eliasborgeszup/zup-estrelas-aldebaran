package br.com.zup.estrelas.funcionariosuniversidades;

public class Administrativo extends Funcionario{
	private String funcaoAdministrativa;
	private String senioridade;
	
	public Administrativo(String nome, String cpf, int numeroRegistro, String orgaoLotacao, float salario, String funcaoAdministrativa, String senioridade) {
		super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
		
		this.funcaoAdministrativa = funcaoAdministrativa;
		this.senioridade = senioridade;
	}
	
	public String getFuncaoAdministrativa() {
		return funcaoAdministrativa;
	}
	public String getSenioridade() {
		return senioridade;
	}
}
