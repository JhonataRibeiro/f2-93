package br.com.project;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

import com.sun.xml.internal.ws.util.ReadAllStream;

public class RelatorioDeDivida {
	private Divida divida;
	
	public RelatorioDeDivida(Divida divida){
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador){
		System.out.println("Cnpj do credor: " + divida.getCnpjCredor());
		System.out.println("Nome do credor: " + divida.getCredor());
		
		System.out.println("Valor total da divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getTotalPago()));
	}
	
	public static void main(String[] args) {
		
		Cnpj cnpj  = new Cnpj("1234567");
		
		Divida divida = new Divida();
		divida.setCnpjCredor(cnpj);
		divida.setCredor("Jhonata");
		divida.setTotal(400);
		
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador("Lucas");
		pagamento.setValor(300);
		pagamento.setCnpjPagador("123123123");
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorio.geraRelatorio(formatador);
		
	}

}
