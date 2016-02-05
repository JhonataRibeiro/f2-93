package br.com.project;

public class Cnpj {
	private String valor;
	
	public String getCnpjCredor() {
		return valor;
	}
	public void setCnpjCredor(String cnpj) {
		this.valor = cnpj;
	}
	private int segundoDigitoCorreto(){
		return 2;
	}
	private int segundoDigitoVerfificador(){
		return 2;
	}
	private int primeiroDigitoCorreto(){
		return 2;
	}
	private int primeiroDigitoVerfificador(){
		return 2;
	}
	public boolean isValid(){
		
		return segundoDigitoCorreto() == segundoDigitoVerfificador()
				&& primeiroDigitoCorreto() == primeiroDigitoVerfificador();
		
	}
}
