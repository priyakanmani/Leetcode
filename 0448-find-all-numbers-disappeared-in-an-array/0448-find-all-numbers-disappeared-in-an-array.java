class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[]=new int[nums.length+1];
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(arr[i]==0)
            {
                l1.add(i);
            }
        }
        return l1;
    }
}