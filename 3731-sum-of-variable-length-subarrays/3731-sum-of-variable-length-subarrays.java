class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        int start=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(0,i-nums[i]);
            while(start<=i)
            {
                sum=sum+nums[start];
                start++;
            }
        }
        return sum;
    }
}