class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    q.add(new Pair(i,j));
                }
            }
        }
       

        int[] drow = { -1, 1, 0, 0 };
        int[] dcol = { 0, 0, -1, 1 };
   

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
    
            for (int i = 0; i < 4; i++) {
                int R = drow[i] + r;
                int C = dcol[i] + c;
                
                if (R >= 0 && R < n && C >= 0 && C < m &&  grid[R][C] == 2147483647 ) {
                    q.add(new Pair(R, C));
                    grid[R][C] = grid[r][c] + 1;
                }
            }
        }
    }
}

class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

