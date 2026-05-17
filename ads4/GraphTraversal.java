import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphTraversal {

    public static void breadthFirstSearch(Graph graph, char startVertex) {
        System.out.print("BFS: ");
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            char current = queue.poll();
            System.out.print(current + " ");

            for (char neighbor : graph.adjacencyList.get(current).keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void depthFirstSearch(Graph graph, char startVertex) {
        System.out.print("DFS: ");
        Set<Character> visited = new HashSet<>();
        dfsHelper(graph, startVertex, visited);
        System.out.println();
    }

    private static void dfsHelper(Graph graph, char vertex, Set<Character> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (char neighbor : graph.adjacencyList.get(vertex).keySet()) {
            if (!visited.contains(neighbor)) {
                dfsHelper(graph, neighbor, visited);
            }
        }
    }
}