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
	
	private String findNodePath(HuffmanNode root, String value) {
		//armazena o caminho
		StringBuilder path = new StringBuilder();
		
		//percorre árvore
		while(root != null && !root.getValue().equals(value)) {
			path.append(root.getValue()).append(" -> ");
			
			//se o valor for menor que o valor da raiz, va para a esquerda
			if(value.compareTo(root.getValue()) < 0) {
				root  = (HuffmanNode)root.getLeftSon();
			} else {
				root = (HuffmanNode)root.getRightSon();
			}
		}
		
		//caso o nó for encontrado, mostra uma mensagem com o caminho
		if(root != null && root.getValue().equals(value)) {
			path.append(" Nó encontrado: ").append(value);
			return path.toString();
		}
		
		//caso nao encontrar o nó, lança exceção com mensagem
		throw new NullPointerException("O nó " + value + "não foi encontrado na árvore");
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
		try {
			return findNodePath(rootNode, value);
		} catch (Exception e) {
			throw new IllegalArgumentException("A string fornecida não é valida.");
		}
	}
}
