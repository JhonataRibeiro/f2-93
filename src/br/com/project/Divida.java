package br.com.project;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {
	
	private double total;
	private double valorPago;
	private String credor;
	private Cnpj cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	
	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}
	
	// Classe que filtra pagamentos antes de:
	
	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for(Pagamento pagamento : this.pagamentos){
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	//pagamento com valores maiores que
	
	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo){
		ArrayList<Pagamento> pagamentosComValorMaiorQue = new ArrayList<Pagamento>();
		for(Pagamento pagamento : this.pagamentos){
			if(pagamento.getValor() > valorMinimo){
				pagamentosComValorMaiorQue.add(pagamento);
			}
		}
		return pagamentosComValorMaiorQue;
	}
	
	// Pagamento do <determinado cliente>
	public ArrayList<Pagamento> pagamentoDo(String cnpjPagador){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for(Pagamento pagamento : this.pagamentos){
			if(pagamento.getCnpjPagador().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getValorPago() {
		return valorPago;
	}
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	
	private void paga(double valor){
		
		if(valor < 0){
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		
		if(this != null){
			if(valor > 8){
				valor = valor - 8;
			}
			this.valorPago += valor;
		}
	}
	
	public void registra(Pagamento pagamento){
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}
	
}
