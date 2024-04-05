package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.BinaryNode;

public class BinaryTree extends BasicTree {

	private BinaryNode rootNode = (BinaryNode) getRootNode();

	public BinaryTree() {
		rootNode = null;
	}
	
	
	private BinaryNode adicionarRecursivamente(BinaryNode node, Integer value) {
	    if (node == null) {
	        return new BinaryNode(value);
	    }

	    if (value < node.getValue()) {
	        node.setLeftSon(adicionarRecursivamente((BinaryNode) node.getLeftSon(), value));
	        
	    } else {
	        node.setRightSon((adicionarRecursivamente((BinaryNode) node.getRightSon(), value)));
	    }

	    return node;
	}
	
	private String printNodePath(Integer value) {
	    BinaryNode tempNo = rootNode;
	    String binaryCode = "";
	    StringBuilder path = new StringBuilder(); // Para armazenar o caminho

	    while (tempNo != null) {
	    	path.append(tempNo.getValue()).append(" -> ");

	        if (tempNo.getValue() < value) {
	        	binaryCode += "1";
	            tempNo = (BinaryNode) tempNo.getRightSon();
	            
	        } else if (tempNo.getValue() > value) {
	        	binaryCode += "0";
	            tempNo = (BinaryNode) tempNo.getLeftSon();
	            
	        } else {
	            return "Caminho até o nó " + value + ": " + path.toString() + "\nBinary Code: " + binaryCode;
	        }
	    }

	    return "Valor não encontrado";
	}
	

	@Override
	public String addNode(String value) {
		try {
			Integer intValue = Integer.parseInt(value);
			rootNode = adicionarRecursivamente(rootNode, intValue);
			return intValue + " Valor adicionado";
			
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Valor fornecido não é válido.");
		}
	}

	@Override
	public String getNode(String value) {
		try {
			Integer intValue = Integer.parseInt(value);
			return printNodePath(intValue);
			
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Valor fornecido não é válido.");
		}
	}
}