package br.com.project;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento> {
	

	private double valorPago;
	

	public double getValorPago() {
		return valorPago;
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
		this.add(pagamento);
		this.paga(pagamento.getValor());
	}
	
	// Classe que filtra pagamentos antes de:
	
		public ArrayList<Pagamento> pagamentosAntesDe(Calendar data){
			ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
			for(Pagamento pagamento : this){
				if(pagamento.getData().before(data)){
					pagamentosFiltrados.add(pagamento);
				}
			}
			return pagamentosFiltrados;
		}

		//pagamento com valores maiores que
		
		public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo){
			ArrayList<Pagamento> pagamentosComValorMaiorQue = new ArrayList<Pagamento>();
			for(Pagamento pagamento : this){
				if(pagamento.getValor() > valorMinimo){
					pagamentosComValorMaiorQue.add(pagamento);
				}
			}
			return pagamentosComValorMaiorQue;
		}
		
		// Pagamento do <determinado cliente>
		public ArrayList<Pagamento> pagamentoDo(String cnpjPagador){
			ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
			for(Pagamento pagamento : this){
				if(pagamento.getCnpjPagador().equals(cnpjPagador)){
					pagamentosFiltrados.add(pagamento);
				}
			}
			return pagamentosFiltrados;
		}

}
