package br.ifpe.datastructures.abstarctsclass;

public abstract class BasicNode {
	
	private BasicNode leftSon;
	private BasicNode rightSon;

	
	public BasicNode(BasicNode leftSon, BasicNode rightSon) {
		super();
		this.leftSon = leftSon;
		this.rightSon = rightSon;
	}

	public BasicNode() {
		super();
	}

	public BasicNode getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(BasicNode leftSon) {
		this.leftSon = leftSon;
	}

	public BasicNode getRightSon() {
		return rightSon;
	}

	public void setRightSon(BasicNode rightSon) {
		this.rightSon = rightSon;
	}


	
}
