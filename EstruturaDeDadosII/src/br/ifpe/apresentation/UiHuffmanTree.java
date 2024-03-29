package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.HuffmanTree;

public class UiHuffmanTree {

	public static void manipularHuffmanTree() {
		HuffmanTree huffamanTree = new HuffmanTree();
		
		Scanner scanner = new Scanner(System.in);
	
	    System.out.println("[1] - add(String): \n[2] - get(Value: )");
	    String input = scanner.nextLine();

	    switch (input) {
	        case "1": {
	            System.out.println("Elemento :");
	            String value = scanner.nextLine();
	            System.out.println("Ocorrencia :");
	            String occurrence = scanner.nextLine();
	            huffamanTree.addNode(value, occurrence); 
	            break;
	        }
	        case "2": {
	            String value = scanner.nextLine();
	            huffamanTree.getNode(value);
	            break;
	        }
	        default:
	            System.out.println("A entrada: " + input + " é invalida");
	            break;
	    }

	    manipularHuffmanTree(); // Loop
	}
}
