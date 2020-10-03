package br.com.zup.estrelas.auladezesseis.bancozup;

import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.AumentarLimiteChequeClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteCartaoClienteException;
import br.com.zup.estrelas.auladezesseis.bancozup.exceptions.DiminuirLimiteChequeClienteException;

public interface IControleLimite {
	void aumentarLimiteCheque(String nomeConta) throws AumentarLimiteChequeClienteException;
	
	void aumentarLimiteCartao(String nomeConta) throws AumentarLimiteCartaoClienteException;
	
	void diminuirLimiteCheque(String nomeConta) throws DiminuirLimiteChequeClienteException;
	
	void diminuirLimiteCartao(String nomeConta) throws DiminuirLimiteCartaoClienteException;
}