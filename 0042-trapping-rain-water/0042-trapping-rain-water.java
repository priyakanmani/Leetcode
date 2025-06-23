class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            left[i]=Math.max(left[i-1],height[i]);
        }
        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            right[i]=Math.max(height[i],right[i+1]);
        }
        int result=0;
        for(int i=0;i<height.length;i++)
        {
            int totalsum=Math.min(left[i],right[i]);
            result=result+(totalsum-height[i]);
        }
        return result;
    }
}