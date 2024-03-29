package br.ifpe.datastructures.node;

import br.ifpe.datastructures.abstarctsclass.BasicNode;

public class HuffmanNode extends BasicNode {
	
	private String value;
	
	
	public HuffmanNode() {
		// TODO Auto-generated constructor stub
	}
	
	public HuffmanNode(String value) {
		super();
		this.value = value;
		
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}


}
