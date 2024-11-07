import java.util.Arrays;

public class TSPGreedy {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };

        int start = 0;
        Result result = nearestNeighborTSP(graph, start);
        System.out.println("Path: " + Arrays.toString(result.path));
        System.out.println("Cost: " + result.cost);
    }

    static class Result {
        int[] path;
        int cost;

        Result(int[] path, int cost) {
            this.path = path;
            this.cost = cost;
        }
    }

    public static Result nearestNeighborTSP(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] path = new int[n + 1];
        int current = start;
        visited[start] = true;
        path[0] = start;
        int totalCost = 0;

        for (int i = 1; i < n; i++) {
            int nearest = -1;
            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[current][j] < minDist) {
                    nearest = j;
                    minDist = graph[current][j];
                }
            }
            path[i] = nearest;
            visited[nearest] = true;
            totalCost += minDist;
            current = nearest;
        }

        // Return to the starting city
        totalCost += graph[current][start];
        path[n] = start;
        return new Result(path, totalCost);
    }
}
