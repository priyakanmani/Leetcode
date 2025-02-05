class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int matele=row*col;
        int val=r*c;
        int res[][]=new int[r][c];
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                l1.add(mat[i][j]);
            }
        }
        if(matele==val)
        {
            int k=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    res[i][j]=l1.get(k++);
                }
            }
            return res;
        }
        return mat;
    }
}