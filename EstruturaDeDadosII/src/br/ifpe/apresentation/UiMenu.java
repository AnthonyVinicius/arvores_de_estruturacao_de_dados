package br.ifpe.apresentation;

import java.util.Scanner;

public class UiMenu {

	public static void ui() {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			System.out.println("[1] - Arvore Binaria \n[2] - Arvore Huffman");
			String input = scanner.nextLine();

			switch (input) {
			case "1": {
				UiBinaryTree.manipularBinaryTree();
				break;
			}

			case "2": {
				UiHuffmanTree.manipularHuffmanTree();
				break;
			}
			default:
				System.out.println("A entrada: " + input + "é invalida");
				break;

			}

		}
	}
}
