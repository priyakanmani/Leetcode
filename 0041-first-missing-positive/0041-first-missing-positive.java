class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int val=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                val++;
            }
            if(nums[i]>val)
            {
                return val;
            } 
        } 
        
        return val;
    }
}