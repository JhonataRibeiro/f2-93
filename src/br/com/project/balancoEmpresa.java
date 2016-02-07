package br.com.project;

import java.util.HashMap;

public class balancoEmpresa {
	
	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();
	
	
	/**
	 * @param credor
	 * @param cnpjCredor
	 * @param valor
	 * @description Classe que registra uma divida
	 */
	
	public void registraDivida(Divida divida){
		dividas.put(divida.getCnpjCredor(), divida);
	}
	
	public void pagaDivida(Cnpj cnpjCredor,Pagamento pagamento){
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null){
			divida.getPagamentos().registra(pagamento);
		}
		
	}

}
