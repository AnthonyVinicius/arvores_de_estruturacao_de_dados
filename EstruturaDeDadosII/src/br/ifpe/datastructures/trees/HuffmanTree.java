package br.ifpe.datastructures.trees;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import br.ifpe.datastructures.abstarctsclass.BasicTree;
import br.ifpe.datastructures.node.HuffmanNode;

public class HuffmanTree extends BasicTree {
	
	public Map<Character, String> encode(String text) {
		char[] letters = text.toCharArray();
		Map<Character, Integer> frequencies = countFrequencies(letters);
		HuffmanNode root = buildTree(frequencies);
		return generateCodes(root);
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
			HuffmanNode left = nodes.poll();
			HuffmanNode right = nodes.poll();
			HuffmanNode parent = new HuffmanNode(left, right);
			nodes.offer(parent);
		}
		return nodes.poll();
	}

	private Map<Character, String> generateCodes(HuffmanNode root) {
		Map<Character, String> codemap = new HashMap<>();
		generateCodes(root, "", codemap);
		return codemap;
	}

	private void generateCodes(HuffmanNode node, String code, Map<Character, String> codemap) {
		if (node.isLeaf()) {
			codemap.put(node.getCharacter(), code);
		} else {
			generateCodes(node.getLeft(), code + "0", codemap);
			generateCodes(node.getRight(), code + "1", codemap);
		}
	}

	@Override
	public String addNode(String value, String occurrence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNode(String value) {
		// TODO Auto-generated method stub
		return null;
	}
}