package br.com.project;

public class Cnpj {
	private String valor;
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	public boolean isValid() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
            && segundoDigitoVerificador() == segundoDigitoCorreto();
      }
	
	private Object segundoDigitoCorreto() {
		// TODO Auto-generated method stub
		return 2;
	}


	private Object segundoDigitoVerificador() {
		// TODO Auto-generated method stub
		return 2;
	}


	private Object primeiroDigitoCorreto() {
		// TODO Auto-generated method stub
		return 1;
	}


	private Object primeiroDigitoVerificador() {
		// TODO Auto-generated method stub
		return 1;
	}

}
