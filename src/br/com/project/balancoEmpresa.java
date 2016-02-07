package br.com.project;

import java.util.HashMap;

public class balancoEmpresa {
	
	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	
	/**
	 * @param credor
	 * @param cnpjCredor
	 * @param valor
	 * @description Classe que registra uma divida
	 */
	
	public void registraDivida(String credor, String cnpjCredor, double valor){
		Divida divida = 	new Divida();
		divida.setCredor(cnpjCredor);
		divida.getCnpjCredor().setValor(cnpjCredor);
		divida.setTotal(valor);
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador){
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null){	
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.getPagamentos().registra(pagamento);
		}
		
	}

}
