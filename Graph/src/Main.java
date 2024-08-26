public class Main {
    public static void main(String[] args) {
        Graph newGraph = new Graph();
        newGraph.addVertex("A");
        newGraph.addVertex("B");
        newGraph.addEdge("A","B");
        newGraph.printGraph();
        newGraph.removeEdge("A","B");
        newGraph.printGraph();
    }
}