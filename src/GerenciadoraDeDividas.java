
public class GerenciadoraDeDividas {
	public void efetuaPagamentoDivida(Divida divida, double valor){
		if(valor > 100){
			valor = valor - 8;
		}
		divida.setValorPago(divida.getValorPago() + valor); 
	}
}
