  package br.ifpe.apresentation;

import java.util.Scanner;

public class UiMenu {
	

	public static void ui() {
		Scanner scanner = new Scanner(System.in);
		
		boolean on_off = true;
		
		while (on_off) {

			System.out.println("[1] - Arvore Binaria \n[2] - Arvore Huffman \n[3] - Close app");
			String input = scanner.nextLine();

			switch (input) {
			case "1": {
				UiBinaryTree.manipularBinaryTree();
			}

			case "2": {
				UiHuffmanTree.manipularHuffmanTree();
			}
			
			case "3": {
				on_off = false;
				break;
			}

			default:
				System.out.println("A entrada: " + input + "é invalida");

			}
		}
	}
}
