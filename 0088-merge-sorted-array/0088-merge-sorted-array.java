class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int v=m;
        for(int i=0;i<n;i++)
        {
            nums1[v++]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}