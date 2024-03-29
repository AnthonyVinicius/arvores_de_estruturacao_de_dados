package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.BinaryTree;

public class UiBinaryTree {
	
	
	public static void manipularBinaryTree() {
		BinaryTree binaryTree = new BinaryTree();

		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("_____________Árvore Bínaria__________\n[1] - add(int Value): \n[2] - get(int Value): \n[3] - Back Menu");
	    String input = scanner.nextLine();

	    switch (input) {
	        case "1": {
	            System.out.println("Elemento :");
	            String value = scanner.nextLine();
	            binaryTree.addNode(value, null);
	            break;
	        }
	        case "2": {
	            String value = scanner.nextLine();
	            binaryTree.getNode(value);
	            break;
	        }
	        case "3": {
				UiMenu.ui();
				break;
			}
	        default:
	            System.out.println("A entrada: " + input + "é invalida");
	            break;
	    }

	    manipularBinaryTree(); // Loop
	}
}
