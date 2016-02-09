package br.com.project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento>{
	
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	private double valorPago;
	

	public double getValorPago() {
		return valorPago;
	}
	
	private void paga(double valor){
		
		if(valor < 0){
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		
		if(this != null){
			if(valor > 100){
				valor = valor - 8;
			}
			this.valorPago += valor;
		}
	}
	
	public void registra(Pagamento pagamento){
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
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

		@Override
		public Iterator<Pagamento> iterator() {
			// TODO Auto-generated method stub
			return pagamentos.iterator();
		}
	

}
