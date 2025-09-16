// Rotten Oranges Problem using Queue (BFS)

import java.util.*;

class RottenOranges {
    // Directions: up, down, left, right
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0, time = 0;

        // Step 1: Add all rotten oranges to queue and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) queue.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        // Step 2: BFS to rot adjacent fresh oranges
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            time++; // Each level = 1 minute
            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                int x = pos[0], y = pos[1];

                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d], ny = y + dy[d];

                    // Check boundaries and if orange is fresh
                    if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2; // rot it
                        fresh--;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }

        return (fresh == 0) ? time : -1; // -1 if some fresh oranges remain
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        int result = orangesRotting(grid);
        System.out.println("Time to rot all oranges: " + result);
    }
}

/*
Sample Output:
Time to rot all oranges: 4
*/
