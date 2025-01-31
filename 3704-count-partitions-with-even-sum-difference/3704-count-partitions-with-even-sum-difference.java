class Solution {
    public int countPartitions(int[] nums) {
        int left=1;
        int right=nums.length;
        int sum1=0;
        int sum2=0;
        int count=0;
        while(left!=right)
        {
            sum1=0;
            sum2=0;
            for(int i=0;i<left;i++)
            {
                sum1=sum1+nums[i];
            }
            for(int i=left;i<nums.length;i++)
            {
                sum2=sum2+nums[i];
            }
            left++;
            if(Math.abs(sum1-sum2)%2==0)
            {
                System.out.println((Math.abs(sum1-sum2)));
                count=count+1;
            }
        }
        return count;
    }
}