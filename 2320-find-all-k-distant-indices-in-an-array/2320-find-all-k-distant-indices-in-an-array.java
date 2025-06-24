class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res=new ArrayList<>();
        List<Integer> list=new ArrayList<Integer>(); 
        for(int i=0;i<nums.length;i++)
        {
                if(nums[i]==key)
                {
                    list.add(i);
                }
        } 
        for(int i=0;i<nums.length;i++)
        {
            int flag=0;
             for(int l:list)
             {
                 if(Math.abs(i-l)<=k)
                 {
                     flag=1;
                 }
             }
             if(flag==1)
             {
                res.add(i);
             }
        }
        return res;
    }
}