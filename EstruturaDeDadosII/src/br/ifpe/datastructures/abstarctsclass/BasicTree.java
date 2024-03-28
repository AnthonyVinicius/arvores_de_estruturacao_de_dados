package br.ifpe.datastructures.abstarctsclass;

import br.ifpe.interfaces.IStructures;

public abstract class BasicTree implements IStructures {
	
	private int tamanho;
	private BasicNode rootNode;
	
	public BasicTree() {
		super();
		tamanho = 0;
		rootNode = null;
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public BasicNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(BasicNode rootNode) {
		this.rootNode = rootNode;
	}
}
