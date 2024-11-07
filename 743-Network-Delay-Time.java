import java.util.Arrays;

class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;

        // Relax edges up to n-1 times (Bellman-Ford algorithm)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < times.length; j++) {
                int u = times[j][0];
                int v = times[j][1];
                int w = times[j][2];
                if (distance[u] != Integer.MAX_VALUE && distance[u] + w < distance[v]) {
                    distance[v] = distance[u] + w;
                }
            }
        }

        // Find the maximum distance to any reachable node
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == Integer.MAX_VALUE) return -1; // Unreachable node
            result = Math.max(result, distance[i]);
        }
        return result;
    }
}
