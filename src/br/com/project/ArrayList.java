package br.com.project;

public class ArrayList implements Iteravel {
	
	public Object proximo(){
		return null;
	}
	
	public void remove(){
		
	}
	
	public boolean contains(Object element){
		return false;
	}
	
	public int size(){
		return 0;
	}

	@Override
	public Iterador percorrerColecao() {
		// TODO Auto-generated method stub
		return new SequenciaDeElementosArrayList(this);
	}

}
