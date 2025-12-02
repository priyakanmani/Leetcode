class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int xor = 0;   // XOR of all array elements
       

        // XOR of array elements
        for (int i = 0; i < n; i++) {
            xor =xor ^ nums[i];
        }

        // XOR of numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor = xor ^i;
        }

      

        return xor;
 

    }
}