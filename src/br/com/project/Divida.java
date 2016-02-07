package br.com.project;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	
	private double total;
	private String credor;
	private Cnpj cnpjCredor;
	private Pagamentos pagamentos = new Pagamentos();

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
		
	public Pagamentos getPagamentos() {
		return pagamentos;
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

	public void setCnpjCredor(Cnpj cnpj) {
		this.cnpjCredor = cnpj;
		
	}
	
	
	
}
