package br.ifpe.datastructures.trees;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.HuffmanNode;

public class HuffmanTree extends BasicTree {

	private Map<Character, String> encode(String text) {
		char[] letters = text.toCharArray();
		Map<Character, Integer> frequencies = countFrequencies(letters);
		HuffmanNode root = buildTree(frequencies);
		return generateMapCodes(root);
	}

	private Map<Character, Integer> countFrequencies(char[] letters) {
		Map<Character, Integer> count = new HashMap<>();
		for (char ch : letters) {
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}
		return count;
	}

	private HuffmanNode buildTree(Map<Character, Integer> frequencies) {
		PriorityQueue<HuffmanNode> nodes = new PriorityQueue<>();
		
		for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
			nodes.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
		}

		while (nodes.size() > 1) {
			HuffmanNode leftSon = nodes.poll();
			HuffmanNode rightSon = nodes.poll();
			HuffmanNode parent = new HuffmanNode(leftSon, rightSon);
			nodes.offer(parent);
		}
		return nodes.poll();
	}

	private Map<Character, String> generateMapCodes(HuffmanNode root) {
		Map<Character, String> codemap = new HashMap<>();
		generateCodes(root, "", codemap);
		return codemap;
	}

	private void generateCodes(HuffmanNode node, String code, Map<Character, String> codemap) {
		if (node.isLeaf()) {
			codemap.put(node.getCharacter(), code);
		} else {
			generateCodes((HuffmanNode)node.getLeftSon(), code + "0", codemap);
			generateCodes((HuffmanNode) node.getRightSon(), code + "1", codemap);
		}
	}


	@Override
	public String addNode(String text) {

		String result ="";
		Map<Character, String> codemap = encode(text);

		for (Map.Entry<Character, String> entry : codemap.entrySet()) {
			result += entry.getKey() + ": " + entry.getValue()+"\n";	
		}

		return "\nCharacter Huffman Codes:" + result;
	}


	@Override
	public String getNode(String value) {
		return null;
	}
}