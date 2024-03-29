package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.BinaryTree;
import br.ifpe.datastructures.trees.HuffamanTree;

public class Apresentation {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void ui() {

		while (true) {

			System.out.println("[1] - Arvore Binaria / [2] - Arvore Huffman");
			String input = scanner.nextLine();

			switch (input) {
			case "1": {
				manipularBinaryTree();
			}

			case "2": {
				manipularHuffmanTree();
			}

			default:
				System.out.println("A entrada: " + input + "é invalida");

			}
		}
	}

	private static void manipularBinaryTree() {
	    BinaryTree binaryTree = new BinaryTree();
	    
	    System.out.println("[1] - add(int Value): \n[2] - get(int Value):");
	    String input = scanner.nextLine();

	    switch (input) {
	        case "1": {
	            System.out.println("Elemento :");
	            String value = scanner.nextLine();
	            binaryTree.addNode(value, null);
	            break; // Adicionado o break aqui
	        }
	        case "2": {
	            String value = scanner.nextLine();
	            binaryTree.getNode(value);
	            break; // Adicionado o break aqui
	        }
	        default:
	            System.out.println("A entrada: " + input + "é invalida");
	            break; // Adicionado o break aqui
	    }

	    manipularBinaryTree(); // Loop
	}

	private static void manipularHuffmanTree() {
	    HuffamanTree huffamanTree = new HuffamanTree();
	    
	    System.out.println("[1] - add(String): \n[2] - get(Value: )");
	    String input = scanner.nextLine();

	    switch (input) {
	        case "1": {
	            System.out.println("Elemento :");
	            String value = scanner.nextLine();
	            System.out.println("Ocorrencia :");
	            String occurrence = scanner.nextLine();
	            huffamanTree.addNode(value, occurrence); 
	            break; // Adicionado o break aqui
	        }
	        case "2": {
	            String value = scanner.nextLine();
	            huffamanTree.getNode(value);
	            break; // Adicionado o break aqui
	        }
	        default:
	            System.out.println("A entrada: " + input + " é invalida");
	            break; // Adicionado o break aqui
	    }

	    manipularHuffmanTree(); // Loop
	}
}
