import java.util.*;

public class DijkstraShortestPath {

    private static class PathNode implements Comparable<PathNode> {
        char vertex;
        int distance;

        public PathNode(char vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(PathNode other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static void computeShortestPath(Graph graph, char source) {
        Map<Character, Integer> distances = new HashMap<>();
        Map<Character, Character> parentMap = new HashMap<>();
        PriorityQueue<PathNode> minHeap = new PriorityQueue<>();
        Set<Character> settled = new HashSet<>();

        for (char vertex : graph.adjacencyList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(source, 0);
        minHeap.add(new PathNode(source, 0));

        while (!minHeap.isEmpty()) {
            char u = minHeap.poll().vertex;

            if (settled.contains(u)) continue;
            settled.add(u);

            Map<Character, Integer> neighbors = graph.adjacencyList.get(u);
            for (Map.Entry<Character, Integer> entry : neighbors.entrySet()) {
                char v = entry.getKey();
                int weight = entry.getValue();

                if (!settled.contains(v)) {
                    int newDistance = distances.get(u) + weight;
                    if (newDistance < distances.get(v)) {
                        distances.put(v, newDistance);
                        parentMap.put(v, u);
                        minHeap.add(new PathNode(v, newDistance));
                    }
                }
            }
        }

        printResults(source, distances, parentMap);
    }

    private static void printResults(char source, Map<Character, Integer> distances, Map<Character, Character> parentMap) {
        System.out.println("\nTask 3");
        for (char vertex : distances.keySet()) {
            System.out.print( vertex + " Short: ");
            if (distances.get(vertex) == Integer.MAX_VALUE) {
                System.out.println("Unreachable");
            } else {
                System.out.print(distances.get(vertex) + " ");
                printPath(vertex, parentMap);
                System.out.println();
            }
        }
    }

    private static void printPath(char target, Map<Character, Character> parentMap) {
        List<Character> path = new ArrayList<>();
        Character current = target;
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
        Collections.reverse(path);

        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) System.out.print("-");
        }
    }
}