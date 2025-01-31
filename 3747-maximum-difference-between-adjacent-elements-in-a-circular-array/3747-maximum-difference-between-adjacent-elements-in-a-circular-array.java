class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int right[]=new int[nums.length];
        int max=0;
        max=Math.abs(nums[nums.length-1]-nums[0]);
       
        for(int i=nums.length-2;i>=0;i--)
        {
            int val=Math.abs(nums[i]-nums[i+1]);
            if(val>max)
            {
                max=val;
            }
        }
        return max;
    }
}