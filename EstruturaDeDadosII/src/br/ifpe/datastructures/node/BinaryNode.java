package br.ifpe.datastructures.node;

import br.ifpe.datastructures.abstarctsclass.BasicNode;

public class BinaryNode extends BasicNode {
	
	private int value;

	public BinaryNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
