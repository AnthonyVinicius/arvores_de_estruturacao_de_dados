package br.ifpe.apresentation;

import java.util.Scanner;

import br.ifpe.datastructures.trees.HuffmanTree;

public class UiHuffmanTree {

	public static void manipularHuffmanTree() {
		HuffmanTree huffmanTree = new HuffmanTree();

		Scanner scanner = new Scanner(System.in);

		while (true){
			try {

				System.out.println("_____________Árvore de Huffman__________\n[1] - add(String): \n[2] - Back Menu");
				String input = scanner.nextLine();

				switch (input) {
				case "1": {
					System.out.println("Digite o texto:");
					String text = scanner.nextLine().trim();//remove qualquer espaço no começo e final da frase;
					System.out.println(huffmanTree.addNode(text));
					break;
				}
				case "2": {
					UiMenu.ui();
					break;
				}
				default:
					System.out.println("A entrada: " + input + " é invalida");
					break;
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}