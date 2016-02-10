package br.com.project;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	
	private double total;
	private String credor;
	private Documento documentoCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public void setDocumentoCredor(Documento documento) {
		this.documentoCredor = documento;
	}
	
	public Documento getDocumentoCredor() {
		return documentoCredor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
		// TODO Auto-generated method stub
		
	}
	public double getTotalPago() {
		return pagamentos.getValorPago();
		
	}
	
	
	
}
