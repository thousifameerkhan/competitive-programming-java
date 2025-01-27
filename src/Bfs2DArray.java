import java.util.LinkedList;
import java.util.Queue;

public class Bfs2DArray {

    static class location {

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        private int x;
        private int y;

        public location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static void BFS(int[][] grid) {
        int row_count = grid.length;
        int col_count = grid[0].length;

        boolean[][] visit_array = new boolean[row_count][col_count];

        Queue<location> q = new LinkedList<>();

        q.add(new location(0, 0));
        visit_array[0][0] = true;

        while (!q.isEmpty()) {

        }


    }


}
