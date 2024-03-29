package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.BinaryNode;

public class BinaryTree extends BasicTree {
	
	private BinaryNode rootNode;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	private void printNodePath(Integer value) {
	    BinaryNode tempNo = rootNode;
	    StringBuilder path = new StringBuilder(); // Para armazenar o caminho

	    while (tempNo != null) {
	        path.append(tempNo.getValue()).append(" -> "); // Adiciona o valor atual ao caminho

	        if (tempNo.getValue() < value) {
	            tempNo = tempNo.getLeftSon();
	        } else if (tempNo.getValue() > value) {
	            tempNo = tempNo.getRightSon();
	        } else {
	            // Encontrou o nó com o valor desejado, imprime o caminho e retorna
	            path.append(value);
	            System.out.println("Caminho até o nó " + value + ": " + path.toString());
	            return;
	        }
	    }
	    throw new NullPointerException("O valor : " + value + "não foi encontrado");
	}

	@Override
	public String addNode(String value, String occurrence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNode(String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
