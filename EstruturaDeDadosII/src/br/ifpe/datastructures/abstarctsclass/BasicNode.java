package br.ifpe.datastructures.abstarctsclass;

public abstract class BasicNode {
	
	private BasicNode leftSon;
	private BasicNode rightSon;
	private BasicNode father;
	private String binaryCode;
	

	
	
	public BasicNode(BasicNode leftSon, BasicNode rightSon) {
		super();
		this.leftSon = leftSon;
		this.rightSon = rightSon;
	}

	public BasicNode(BasicNode leftSon, BasicNode rightSon, BasicNode father) {
		super();
		this.leftSon = leftSon;
		this.rightSon = rightSon;
		this.father = father;
	}

	public BasicNode(BasicNode leftSon, BasicNode rightSon, BasicNode father, String binaryCode) {
		super();
		this.leftSon = leftSon;
		this.rightSon = rightSon;
		this.father = father;
		this.binaryCode = binaryCode;
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

	public BasicNode getFather() {
		return father;
	}

	public void setFather(BasicNode father) {
		this.father = father;
	}

	public String getBinaryCode() {
		return binaryCode;
	}

	public void setBinaryCode(String binaryCode) {
		this.binaryCode = binaryCode;
	}
}
