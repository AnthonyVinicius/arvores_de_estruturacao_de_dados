package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.BinaryTree;

public class UiBinaryTree {
	static BinaryTree binaryTree = new BinaryTree();
	
	
	public static void manipularBinaryTree() {

		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("_____________Árvore Bínaria__________\n[1] - add(int Value): \n[2] - get(int Value): \n[3] - Back Menu");
	    String input = scanner.nextLine();

	    switch (input) {
	        case "1": {
	            System.out.println("Adicionar elemento :");
	            String value = scanner.nextLine();
	            System.out.println(binaryTree.addNode(value, null));
	            break;
	        }
	        case "2": {
	        	System.out.println("Buscar elemento :");
	            String value = scanner.nextLine();
	            System.out.println(binaryTree.getNode(value));
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
