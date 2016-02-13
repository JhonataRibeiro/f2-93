package br.com.project;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	
	private ArmazenadorDeDividas dividas;
	
	public BalancoEmpresa(ArmazenadorDeDividas bd){
		this.dividas = bd;
	}
	
	
	/**
	 * @param credor
	 * @param cnpjCredor
	 * @param valor
	 * @description Classe que registra uma divida
	 */ 
	
	public void registraDivida(Divida divida){
			dividas.salva(divida);	
	}
	
	public void pagaDivida(Documento documento,Pagamento pagamento){
		Divida divida = dividas.carrega(documento);
		if(divida != null){
			divida.registra(pagamento);
		}
		dividas.salva(divida);
	}

}
