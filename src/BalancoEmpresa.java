import java.util.HashMap;

public class BalancoEmpresa {
	
	//Hash map
	 private HashMap <String, Divida> dividas = new HashMap<String,Divida>();
	
	//Método para registrar uma divida
	public void registraDivida(String credor, String cnpjCredor, double valor){
		Divida divida = new Divida();
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setTotal(valor);
		dividas.put(cnpjCredor,divida);
	}
	
	//Metodo para pagamento de divida
	public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador){
		Divida divida = dividas.get(cnpjCredor);
		if(divida != null){
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setCnpjPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
}
