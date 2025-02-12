class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        
        int maxcount=0;
        int divisorVal=Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    count++;
                }
            }
            if(count>maxcount||(count==maxcount && divisors[i]<divisorVal))
            {
                maxcount=count;
                divisorVal=divisors[i];
            }
            
        }
        
        return divisorVal;
    }
}