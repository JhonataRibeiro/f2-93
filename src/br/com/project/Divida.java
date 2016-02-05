package br.com.project;
import java.util.ArrayList;

public class Divida {
	
		private double total;
		private double valorPago;
		private String credor;
		private Cnpj cnpjCredor = new Cnpj(); 
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
				throw new IllegalArgumentException("Valor inválido!");
			}
			if(valor > 100){
				// Tacha cobrada para valores acima de 100
				valor  = valor - 8;
			}
		
		this.valorPago +=  valor;
			
		}
		
		public void registra(Pagamento pagamento){
			// adicionar a lista de pagamento
			this.getPagamentos().add(pagamento);
			// chama o metodo paga
			this.paga(pagamento.getValor());
			
			
		}
}
