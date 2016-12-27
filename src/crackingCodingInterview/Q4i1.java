package crackingCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q4i1 {
	public static void main(String... arg) {

		// Describe a graph

		Graph graph = new Graph();
		for (int i : new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }) {
			graph.nodes.add(new Node(i));
		}

		graph.getNode(1).children.addAll(Arrays.asList(graph.getNode(2), graph.getNode(3), graph.getNode(4)));
		graph.getNode(2).children.addAll(Arrays.asList(graph.getNode(5), graph.getNode(6)));
		graph.getNode(3).children.addAll(Arrays.asList(graph.getNode(7)));
		graph.getNode(4).children.addAll(Arrays.asList(graph.getNode(8), graph.getNode(9)));
		graph.getNode(5).children.addAll(Arrays.asList(graph.getNode(10)));
		graph.getNode(7).children.addAll(Arrays.asList(graph.getNode(11), graph.getNode(12)));
		printGraph(graph);
		
		Node start;
		Node end;
		start = graph.getNode(1);
		end = graph.getNode(12);
		
		//Test
		if(searchBFS(graph, start, end)) 
			System.out.format("I find path from %s to %s \n", start, end);
		else
			System.out.format("I don't find path from %s to %s \n", start, end);

		start = graph.getNode(5);
		end = graph.getNode(12);
		
		if(searchBFS(graph, start, end)) 
			System.out.format("I find path from %s to %s \n", start, end);
		else
			System.out.format("I don't find path from %s to %s \n", start, end);

		
	}

	private static void printGraph(Graph graph) {
		for (Node node : graph.nodes) {
			System.out.print(node + " : ");
			for (int i = 0; i < node.children.size(); i++) {
				System.out.print(node.children.get(i));
				if (i != node.children.size() - 1)
					System.out.print(", ");
			}
			System.out.println();
		}
	}

	private static boolean searchBFS(Graph graph, Node source, Node destination) {

		if (source == destination)
			return true;
		for(Node n : graph.getNodes())
			n.state=State.Unvisited;

		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(source);
		
		while (!queue.isEmpty()) {
			Node u = queue.removeFirst();
			if (u != null) {
				for (Node n : u.children) {
					if (n.state == State.Unvisited) {
						if (n == destination) {
							return true;
						} else {
							n.state = State.Visiting;
							queue.add(n);
						}
					}
				}
				u.state = State.Visited;
			}
		}

		return false;
	}

	private static class Graph {
		ArrayList<Node> nodes = new ArrayList<Node>();

		public List<Node> getNodes() {
			return nodes;
		}

		public Node getNode(int id) {
			Iterator<Node> iterator = nodes.iterator();
			while (iterator.hasNext()) {
				Node node = iterator.next();
				if (node.id == id)
					return node;

			}
			return null;
		}

	}

	private static class Node {
		int id;
		State state;
		List<Node> children = new ArrayList<Node>();

		public Node(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "" + id;
		}
	}

	enum State {
		Unvisited, Visited, Visiting;
	}

}
