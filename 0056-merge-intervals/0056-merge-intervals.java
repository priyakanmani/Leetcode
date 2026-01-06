class Solution {
    public int[][] merge(int[][] intervals) {
        int merger[][]=new int[intervals.length][1];
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        merger[0]=intervals[0];
        int j=0;
        for(int i=0;i<intervals.length;i++)
        {
            if(merger[j][1]>=intervals[i][0])
            {
                merger[j][1]=Math.max(merger[j][1],intervals[i][1]);
            }
            else
            {
                j++;
                merger[j]=intervals[i];
            }
        }
        return Arrays.copyOf(merger,j+1);
    }
}