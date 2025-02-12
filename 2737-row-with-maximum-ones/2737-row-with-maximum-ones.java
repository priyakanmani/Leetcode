class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count=0;
        int maxcount=0;
        int minindex=0;
        int index=0;
        for(int i=0;i<mat.length;i++)
        {
            count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count=count+1;
                }
            }
            index=i;
            if(count>maxcount)
            {
                maxcount=count;
                minindex=index;
            }
        }
        int arr[]=new int[2];
        arr[0]=minindex;
        arr[1]=maxcount;
        return arr;
    }
}