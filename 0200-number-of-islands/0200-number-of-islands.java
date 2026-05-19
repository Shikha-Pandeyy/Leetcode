class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count =0;
        boolean[][] visit = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'&& visit[i][j] != true){
                    dfs(i, j, visit, grid);
                    count++;
                }
            }
        }
        return count;  
    }

    public void dfs(int i,int j, boolean[][] visit, char[][] grid){
        if(i<0 || j<0 || i>=m || j>=n || visit[i][j] || grid[i][j]=='0')
            return;

        visit[i][j] = true;
        dfs(i-1, j, visit, grid);
        dfs(i+1, j, visit, grid);
        dfs(i, j-1, visit, grid);
        dfs(i, j+1, visit, grid);    
    }
}