class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int r=0;r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(grid[r][c]==2) q.offer(new int[]{r,c});
                else if(grid[r][c]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        int minutes=0;
        while(!q.isEmpty() && fresh>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
               int curr[]=q.poll();
               int r=curr[0];
               int c=curr[1];
               for(int d[]:dir)
               {
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]==1)
                {
                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                    fresh--;
                }
               }
            }
            minutes++;
        }
        return fresh==0?minutes:-1;
    }
}