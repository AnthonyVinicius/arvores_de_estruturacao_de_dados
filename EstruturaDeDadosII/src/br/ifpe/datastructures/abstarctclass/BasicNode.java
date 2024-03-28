package br.ifpe.datastructures.abstarctclass;

public abstract class BasicNode {
	
	private BasicNode leftSon;
	private BasicNode rightSon;
	private BasicNode father;
	private String binaryCode;
	private Integer value;
	
	public BasicNode(Integer value) {
		super();
		this.value = value;
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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
