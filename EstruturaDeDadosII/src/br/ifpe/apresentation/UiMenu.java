  package br.ifpe.apresentation;

import java.util.Scanner;

public class UiMenu {
	

	public static void ui() {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("[1] - Arvore Binaria / [2] - Arvore Huffman");
			String input = scanner.nextLine();

			switch (input) {
			case "1": {
				UiBinaryTree.manipularBinaryTree();
			}

			case "2": {
				UiHuffmanTree.manipularHuffmanTree();
			}

			default:
				System.out.println("A entrada: " + input + "é invalida");

			}
		}
	}
}
