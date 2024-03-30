package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.BinaryNode;

public class BinaryTree extends BasicTree {

	private BinaryNode rootNode = (BinaryNode) getRootNode();

	public BinaryTree() {
		rootNode = null;
	}
	
	
	private BinaryNode adicionarRecursivamente(BinaryNode raiz, Integer value) {
	    if (raiz == null) {
	        return new BinaryNode(value);
	    }

	    if (value < raiz.getValue()) {
	        raiz.setLeftSon(adicionarRecursivamente((BinaryNode) raiz.getLeftSon(), value));
	        
	    } else {
	        raiz.setRightSon((adicionarRecursivamente((BinaryNode) raiz.getRightSon(), value)));
	    }

	    return raiz;
	}
	
	private String printNodePath(Integer value) {
	    BinaryNode tempNo = rootNode;
	    StringBuilder path = new StringBuilder(); // Para armazenar o caminho

	    while (tempNo != null) {
	    	System.out.println("While: " + tempNo.getValue());
	    	path.append(tempNo.getValue()).append(" -> "); // Adiciona o valor atual ao caminho

	        if (tempNo.getValue() < value) {
	        	System.out.println(tempNo.getValue());
	            tempNo = (BinaryNode) tempNo.getRightSon();
	        } else if (tempNo.getValue() > value) {
	        	System.out.println(tempNo.getValue());
	            tempNo = (BinaryNode) tempNo.getLeftSon();
	        } else {
	            // Encontrou o nó com o valor desejado, imprime o caminho e retorna
	            path.append(value);
	            System.out.println("Caminho até o nó " + value + ": " + path.toString());
	            return "Caminho até o nó " + value + ": " + path.toString();
	        }
	    }

	    // Se o valor não foi encontrado, imprime uma mensagem
	    System.out.println("Valor " + value + " não encontrado na árvore.");
	    return "Caminho até o nó " + value + ": " + path.toString();
	}
	

	@Override
	public String addNode(String value, String occurrence) {
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