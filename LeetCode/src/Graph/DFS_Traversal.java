package Graph;


/**
 * DFS: Depth First Search
 * Topic: Graph
 *
 * Description:
 * Traverse a graph by exploring as deep as possible
 * before backtracking.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

import java.util.*;

class DFS_Traversal {

    void dfs(int node, boolean[] visited,
             List<List<Integer>> graph) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
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

        DFS_Traversal solution = new DFS_Traversal();
        boolean[] visited = new boolean[vertices];

        solution.dfs(0, visited, graph);
    }
}
