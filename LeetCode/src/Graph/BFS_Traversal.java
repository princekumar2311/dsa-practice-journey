package Graph;

/**
 * BFS: Breadth First Search
 * Topic: Graph
 *
 * Description:
 * Traverse a graph level by level using a Queue.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

import java.util.*;

class BFS_Traversal {

    void bfs(int start, List<List<Integer>> graph) {

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        // Mark starting node and add to queue
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {

            // Remove the front node
            int node = queue.poll();

            // Visit the current node
            System.out.print(node + " ");

            // Explore all neighbors
            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        graph.get(0).add(1);
        graph.get(0).add(4);
        graph.get(1).add(2);
        graph.get(2).add(3);

        BFS_Traversal solution = new BFS_Traversal();

        solution.bfs(0, graph);
    }
}
