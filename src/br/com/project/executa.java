package br.com.project;

public class executa {
	
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		pagamento1.setValor(30);
		pagamento2.setValor(10);
		pagamentos.add(pagamento1);
		pagamentos.add(pagamento2);
		System.out.println("Valor total pago " + pagamentos.getValorPago());
	}

}
