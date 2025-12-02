class Solution {
    public int missingNumber(int[] nums) {
        

         // example
        int n = nums.length;

        int xor1 = 0;   // XOR of all array elements
        int xor2 = 0;   // XOR of all numbers from 0 to n

        // XOR of array elements
        for (int i = 0; i < n; i++) {
            xor1 ^= nums[i];
        }

        // XOR of numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor2 ^= i;
        }

        // Missing number = xor1 ^ xor2
        int missing = xor1 ^ xor2;

        return missing;
 

    }
}