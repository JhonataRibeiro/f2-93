package br.com.project;

public class For {
	public void percorreColecao(Iteravel colecao){
		Iterador sequencia = colecao.percorrerColecao();
		Object primeiro = sequencia.proximo();
		Object segundo = sequencia.proximo();
	}	

}
