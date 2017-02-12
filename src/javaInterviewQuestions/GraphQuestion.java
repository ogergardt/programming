package javaInterviewQuestions;

import java.util.*;


public class GraphQuestion {

    static class Graph {
        
        HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
                
        public Node getNode(int id){
            if(nodes.containsKey(id)) return nodes.get(id);
        return null;
        }
    
    }

    static class Node {
        int id;
        int weight = 1;
        List<Node> childs = new ArrayList<Node>();
        
        public Node(int id){
            this.id=id;
        }
      
    }
    
    private static void printLevels(Graph graph){

        LinkedList<Node> queue = new LinkedList<Node>();
        //add to queue the root node of the graph
        queue.add(graph.getNode(1)); 
        int i=-1;
        while(!queue.isEmpty()){
            Node cur = queue.removeFirst();     
            if(i!=cur.weight){
                i=cur.weight;
                System.out.format("\nlevel %d : ", i);
            } 
            System.out.print(" "+ cur.id);
            for(Node node : cur.childs){
                node.weight=cur.weight+1;
                queue.add(node);
            }
        }
    
    }
    
    public static void main(String[] args){
    
        //Description of the graph
        Graph graph = new Graph();
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int a : arr){
            graph.nodes.put(a,new Node(a));
        }
        
        graph.getNode(1).childs = Arrays.asList(new Node[]{graph.getNode(2),graph.getNode(3),graph.getNode(4)});
        graph.getNode(2).childs = Arrays.asList(new Node[]{graph.getNode(5),graph.getNode(6)});
        graph.getNode(3).childs = Arrays.asList(new Node[]{graph.getNode(7)});
        graph.getNode(4).childs = Arrays.asList(new Node[]{graph.getNode(8),graph.getNode(9)});
        graph.getNode(5).childs = Arrays.asList(new Node[]{graph.getNode(10)});
        graph.getNode(7).childs = Arrays.asList(new Node[]{graph.getNode(11),graph.getNode(12)});

        printLevels(graph);
    }
}