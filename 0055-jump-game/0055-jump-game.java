class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        boolean res=false;
        while(i<nums.length)
        {
            if(i+nums[i]>=nums.length-1)
            {
                return true;
            }
            if(nums[i]==0 && i!=nums.length)
            {
                return false;
            }
            int max=0;
            int maxpos=i;
            for(int j=1;j<=nums[i];j++)
            {
               if(i+j<nums.length && i+j+nums[i+j]>max)
               {
                  max=i+j+nums[i+j];
                  maxpos=i+j;
               }
            }
            if(maxpos==i)
            {
                return false;
            }
            i=maxpos;
              
        }
        return res;
    }
}