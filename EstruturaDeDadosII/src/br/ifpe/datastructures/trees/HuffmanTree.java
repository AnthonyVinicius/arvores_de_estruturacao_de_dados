package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.HuffmanNode;

public class HuffmanTree extends BasicTree {

	private String rootNode;

	HuffmanNode node = new HuffmanNode();
	
	public HuffmanTree() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addNode(String value, String occurrence) {
		return null;
		}
	
	
	public String addNode(String value, int occurence) {
		
		if(rootNode == null) {
		
			rootNode = value;
			
		}else {
			node.setValue(value);
			node.setFather(node);
			
		}
		
		return null;
	}
	
	
	@Override
	public String getNode(String value) {
		// TODO Auto-generated method stub
		return null;
	}
}
