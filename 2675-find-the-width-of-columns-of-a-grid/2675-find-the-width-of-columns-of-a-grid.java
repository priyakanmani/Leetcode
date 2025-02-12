class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int arr[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            int maxcount=0;
            for(int j=0;j<grid.length;j++)
            {
                int n=grid[j][i];
                int count=0;
                if(n>0)
                {
                    count=0;
                }
                else
                {
                    count=1;
                }
                
                while(n!=0)
                {
                    n=n/10;
                    count++;
                }
                if(count>maxcount)
                {
                    maxcount=count;
                }
            }
            
            arr[i]=maxcount;
        }
        return arr;
    }
}