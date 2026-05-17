public class Mainn {
    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.add_vertex('A');
        graph.add_vertex('B');
        graph.add_vertex('C');
        graph.add_vertex('D');
        graph.add_vertex('E');

        graph.add_edge('B', 'A', 10);
        graph.add_edge('C', 'A', 6);
        graph.add_edge('D', 'C', 7);
        graph.add_edge('E', 'D', 6);
        graph.add_edge('E', 'B', 1);
        graph.add_edge('D', 'A', 1);

        graph.printGraph();
        System.out.println();

        System.out.println("task 2");
        GraphTraversal.depthFirstSearch(graph, 'E');
        GraphTraversal.breadthFirstSearch(graph, 'E');

        DijkstraShortestPath.computeShortestPath(graph, 'C');
    }
}
