package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.HuffmanTree;

public class UiHuffmanTree {

	public static void manipularHuffmanTree() {
		HuffmanTree huffmanTree = new HuffmanTree();
		
		Scanner scanner = new Scanner(System.in);
	
		while (true){
			
			System.out.println("_____________Árvore de Huffman__________\n[1] - add(String): \n[2] - get(Value: ) \n[3] - Back Menu");
			String input = scanner.nextLine();
			
			switch (input) {
			case "1": {
				System.out.println("Elemento :");
				String value = scanner.nextLine();
				System.out.println("Ocorrencia :");
				String occurrence = scanner.nextLine();
				huffmanTree.addNode(value, occurrence); 
				break;
			}
			case "2": {
				System.out.println("Valor: ");
				String value = scanner.nextLine();
				huffmanTree.getNode(value);
				break;
			}
			case "3": {
				UiMenu.ui();
				break;
			}
			default:
				System.out.println("A entrada: " + input + " é invalida");
				break;
			}
		}

	}
}
