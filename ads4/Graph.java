import java.util.HashMap;
import java.util.Map;

public class Graph {
    Map<Character, Map<Character, Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void add_vertex(char v) {
        if (!adjacencyList.containsKey(v)) {
            adjacencyList.put(v, new HashMap<>());
        }
    }

    public void add_edge(char u, char v, int weight) {
        add_vertex(u);
        add_vertex(v);

        adjacencyList.get(u).put(v, weight);
        adjacencyList.get(v).put(u, weight);
    }

    public void printGraph() {
        System.out.println("Task 1");
        for (char vertex : adjacencyList.keySet()) {
            System.out.print(vertex + ": ");
            Map<Character, Integer> neighbors = adjacencyList.get(vertex);
            for (Map.Entry<Character, Integer> entry : neighbors.entrySet()) {
                System.out.print(" (" + entry.getKey() + ", w: " + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}