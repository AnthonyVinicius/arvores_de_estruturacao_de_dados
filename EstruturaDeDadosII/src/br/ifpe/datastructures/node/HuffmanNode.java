package br.ifpe.datastructures.node;

import br.ifpe.datastructures.abstarctsclass.BasicNode;

public class HuffmanNode extends BasicNode {
	
	private String value;
	private int frequency;
	
	
	public HuffmanNode() {
		// TODO Auto-generated constructor stub
	}
	
	public HuffmanNode(String value, int frequency) {
		super();
		this.value = value;
		this.frequency = frequency;
		
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

}
