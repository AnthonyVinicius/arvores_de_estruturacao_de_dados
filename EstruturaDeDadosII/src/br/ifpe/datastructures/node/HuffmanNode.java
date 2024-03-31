package br.ifpe.datastructures.node;

import br.ifpe.datastructures.abstarctsclass.BasicNode;

public class HuffmanNode extends BasicNode implements Comparable<HuffmanNode> {
	
	private char character;
	private int frequency;
	private HuffmanNode left;
	private HuffmanNode right;

	public HuffmanNode(char character, int frequency) {
		this.character = character;
		this.frequency = frequency;
	}

	public HuffmanNode(HuffmanNode left, HuffmanNode right) {
		this.left = left;
		this.right = right;
		this.frequency = left.getFrequency() + right.getFrequency();
	}

	public char getCharacter() {
		return character;
	}

	public int getFrequency() {
		return frequency;
	}

	public boolean isLeaf() {
		return left == null && right == null;
	}

	public HuffmanNode getLeft() {
		return left;
	}

	public HuffmanNode getRight() {
		return right;
	}

	@Override
	public int compareTo(HuffmanNode o) {
		return frequency - o.frequency;
	}

}
