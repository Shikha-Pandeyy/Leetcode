class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<List<Integer>> q = new LinkedList<>();
        int rot =0;
        int fresh = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2)
                   {q.add(Arrays.asList(i, j));
                    rot++;}
                if(grid[i][j] == 1)
                    fresh++;
            }
        }

        if(fresh == 0)
            return 0;
        if(rot ==0 && fresh!= 0)
            return -1;
        int day =0;
        while(!q.isEmpty()){
            int rotten = q.size();
            boolean flag = false;
            while(rotten != 0){
                List<Integer> temp = q.poll();
                int r = temp.get(0);
                int c = temp.get(1);

                if(c-1>=0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.add(Arrays.asList(r, c-1));
                    fresh--;
                    flag = true;
                }
                if(c+1<n && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.add(Arrays.asList(r, c+1));
                    fresh--;
                    flag = true;
                }
                if(r+1<m && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.add(Arrays.asList(r+1, c));
                    fresh--;
                    flag = true;
                }
                if(r-1>=0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.add(Arrays.asList(r-1, c));
                    fresh--;
                    flag = true;
                }

                rotten--;

            }
            if(flag== true)
                day++;
        }
        if(fresh > 0){
            return -1;
        }
        return day;
        
    }
}