class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        int arr[]=new int[2];
        int j=0;
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
                    arr[j++]=n;
                }
            }
        }
    return arr;
    }
}