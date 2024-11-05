import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> ad, int[] visited) {
        visited[node] = 1;
        for (int neighbor : ad.get(node)) {
            if (visited[neighbor] == 0) {
                dfs(neighbor, ad, visited);
            }
        }
    }

    public int findCircleNum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Adjacency list
        ArrayList<ArrayList<Integer>> ad = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ad.add(new ArrayList<>());
        }

        // Populate adjacency list
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && i != j) {
                    ad.get(i).add(j);
                    ad.get(j).add(i); // Undirected graph
                }
            }
        }

        int[] visited = new int[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, ad, visited);
            }
        }
        return count;
    }
}

