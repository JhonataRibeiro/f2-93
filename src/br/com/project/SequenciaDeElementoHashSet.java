package br.com.project;

public class SequenciaDeElementoHashSet implements Iterador{
	private HashSet colecao;
	public SequenciaDeElementoHashSet(HashSet colecao){
		this.colecao = colecao;
	}
	
	public Object proximo(){
		return null;
	}
}
