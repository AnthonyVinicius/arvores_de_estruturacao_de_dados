package br.ifpe.datastructures.abstarctsclass;

import br.ifpe.interfaces.IStructures;

public abstract class BasicTree implements IStructures {
	
	private int tamanho;
	
	public BasicTree() {
		super();
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}
