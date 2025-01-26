class Solution {
    public int missingInteger(int[] nums) {
        int val=nums[0];
        int sum=0;
        int res=sum;
        int flag=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(val==nums[i])
            {
                sum=sum+val;
                val++;
            }
            else
            {
                flag=1;
                res=sum;
                break;
            }
            count++;
        }
        if(flag==0 && count==nums.length)
        {
            res=sum;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=res && nums[i]==res)
            {
                res++;
            }
            else if(nums[i]>=res)
            {
                return res;
            }
        }
        return res;
    }
}