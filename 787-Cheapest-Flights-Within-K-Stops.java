import java.util.Arrays;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // Initialize distances with infinity
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;

        // Temporary array to store distances after each round of relaxation
        int[] tempDistance = Arrays.copyOf(distance, n);

        // Relax edges up to K + 1 times
        for (int i = 0; i <= K; i++) {
            for (int[] flight : flights) {
                int s = flight[0];
                int d = flight[1];
                int price = flight[2];

                // If the source node `u` has been reached, we try to relax the edge
                if (distance[s] != Integer.MAX_VALUE && distance[s] + price < tempDistance[d]) {
                    tempDistance[d] = distance[s] + price;
                }
            }
            // Update distances for the next iteration
            distance = Arrays.copyOf(tempDistance, n);
        }

        // If destination is still unreachable, return -1
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }
}
