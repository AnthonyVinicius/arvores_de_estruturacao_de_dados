package br.ifpe.datastructures.node;

import br.ifpe.datastructures.abstarctsclass.BasicNode;

public class HuffmanNode extends BasicNode implements Comparable<HuffmanNode> {
	

	private char character;
	private int frequency;
//	private HuffmanNode left;
//	private HuffmanNode right;
	
	

	public HuffmanNode(char character, int frequency) {
		this.character = character;
		this.frequency = frequency;
	}

	public HuffmanNode(HuffmanNode leftSon, HuffmanNode rightSon) {
		super(leftSon, rightSon);
		
		this.frequency = leftSon.getFrequency() + rightSon.getFrequency();
	}

	public char getCharacter() {
		return character;
	}

	public int getFrequency() {
		return frequency;
	}

	public boolean isLeaf() {
		return getLeftSon() == null && getRightSon() == null;
	}

	@Override
	public int compareTo(HuffmanNode o) {
		return frequency - o.frequency;
	}

}
