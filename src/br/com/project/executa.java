package br.com.project;

import java.util.ArrayList;

public class executa {
	
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(30);
		pagamento2.setValor(10);
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		System.out.println("Valor total pago " + pagamentos.getValorPago());
		
		Iterable<Pagamento> lista = new Pagamentos();
		for(Pagamento pagamento : pagamentos){
			System.out.println(pagamento.getValor());
		}
		
	}

}
