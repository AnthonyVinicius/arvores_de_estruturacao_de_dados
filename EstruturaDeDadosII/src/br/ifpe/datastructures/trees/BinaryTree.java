package br.ifpe.datastructures.trees;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.BinaryNode;

public class BinaryTree extends BasicTree {

	private BinaryNode rootNode;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	private BinaryNode adicionarRecursivamente(BinaryNode raiz, BinaryNode newNode) {
	    if (raiz == null) {
	        return newNode;
	    }

	    if (newNode.getValue() < raiz.getValue()) {
	        raiz.setLeftSon(adicionarRecursivamente((BinaryNode) raiz.getLeftSon(), newNode));
	    } else {
	        raiz.setRightSon(adicionarRecursivamente((BinaryNode) raiz.getRightSon(), newNode));
	    }

	    return raiz;
	}
	

	private String printNodePath(Integer value) {
		BinaryNode tempNo = rootNode;
		String caminho = "";
		
		while (tempNo != null) {
			caminho += tempNo.getValue() + " -> ";

			if (tempNo.getValue() < value) {
				tempNo = (BinaryNode) tempNo.getLeftSon();
			} else if (tempNo.getValue() > value) {
				tempNo = (BinaryNode) tempNo.getRightSon();
			} else {
				// Encontrou o nó com o valor desejado, imprime o caminho e retorna
				caminho += "| Nó encontrado: " + value;
				return caminho;
			}
		}
		throw new NullPointerException("O valor : " + value + "não foi encontrado");
	}
	
	

	@Override
	public String addNode(String value, String occurrence) {
	    try {
	        Integer intValue = Integer.parseInt(value);
	        BinaryNode newNode = new BinaryNode(intValue);
	        rootNode = adicionarRecursivamente(rootNode, newNode);
	        return null;
	    } catch (Exception e) {
	        throw new IllegalArgumentException("Valor fornecido não é válido");
	    }
	}

	@Override
	public String getNode(String value) {
		// TODO Auto-generated method stub
		try {
			Integer intValue = Integer.parseInt(value);
			return printNodePath(intValue);
		} catch (Exception e) {
			// TODO: handle exception
			throw new IllegalArgumentException("Valor fornecido não é valido");
		}
	}
}
