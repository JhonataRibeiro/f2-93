package br.com.project;

import java.util.HashMap;

public class balancoEmpresa {
	
	private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
	
	/**
	 * @param credor
	 * @param cnpjCredor
	 * @param valor
	 * @description Classe que registra uma divida
	 */
	
	public void registraDivida(Divida divida){
			dividas.put(divida.getCnpjCredor(), divida);	
		
	}
	
	public void pagaDivida(Documento documento,Pagamento pagamento){
		Divida divida = dividas.get(documento);
		if(divida != null){
			divida.registra(pagamento);
		}
		
	}

}
