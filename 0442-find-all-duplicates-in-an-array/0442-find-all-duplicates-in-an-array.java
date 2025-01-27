class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        for(int n:h1.keySet())
        {
            if(h1.get(n)>1)
            {
                if(l1.contains(n))
                {

                }
                else
                {
                    l1.add(n);
                }
            }
        }
        return l1;
    }
}