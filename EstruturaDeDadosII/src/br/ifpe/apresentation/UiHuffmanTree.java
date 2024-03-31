package br.ifpe.apresentation;

import java.util.Map;
import java.util.Scanner;

import br.ifpe.datastructures.trees.HuffmanTree;

public class UiHuffmanTree {

	public static void manipularHuffmanTree() {
		HuffmanTree huffmanTree = new HuffmanTree();

		Scanner scanner = new Scanner(System.in);

		while (true){

			System.out.println("_____________Árvore de Huffman__________\n[1] - add(String): \n[2] - Back Menu");
			String input = scanner.nextLine();

			switch (input) {
			case "1": {
				System.out.println("Type the text to be encoded");
				String text = scanner.nextLine().trim();
				Map<Character, String> codemap = huffmanTree.encode(text);

				System.out.println("Character Huffman Codes:");
				for (Map.Entry<Character, String> entry : codemap.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			}
			case "2": {
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
