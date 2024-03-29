package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.BinaryNode;
import br.ifpe.datastructures.node.HuffmanNode;

public class HuffmanTree extends BasicTree {

	private HuffmanNode rootNode;
	
	HuffmanNode node = new HuffmanNode();
	
	public HuffmanTree() {
		// TODO Auto-generated constructor stub
		rootNode = null;
	}

	private HuffmanNode addNodeRecursively(HuffmanNode root, HuffmanNode newNode) {
		if (root == null) {
			return newNode;
		}
		if(newNode.getFrequency() < root.getFrequency()) {
			root.setLeftSon(addNodeRecursively((HuffmanNode)root.getLeftSon(), newNode));
		} else {
			root.setRightSon(addNodeRecursively((HuffmanNode)root.getRightSon(), newNode));
		}
		
		return root;
	}
	
	@Override
	public String addNode(String value, String occurrence) {
		try {
			int IntOccurrence = Integer.parseInt(occurrence);
			HuffmanNode newNode = new HuffmanNode(value, IntOccurrence);
			rootNode = addNodeRecursively(rootNode, newNode);
			return null;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("A ocorrência fornecida não é valida");
		}
	}
	
	
	@Override
	public String getNode(String value) {
		// TODO Auto-generated method stub
		return null;
	}
}
