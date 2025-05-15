class Solution {
    Integer[][] memo;
    int SWAPPED = 0;
    int NOT_SWAPPED = 1;

    int NOT_VALID = (int) Math.pow(10, 6);
    public int minSwap(int[] nums1, int[] nums2) {
        this.memo = new Integer[nums1.length][2];
        return dfs(nums1, nums2, 0, NOT_SWAPPED);
    }

    private int dfs(int[] nums1, int[] nums2, int index, int swapped) {
        if (index == nums1.length) return 0;

        if (memo[index][swapped] != null) return memo[index][swapped];

        // we have 2 option: 1) swap our arr[index] or not
        int option1 = NOT_VALID;
        // before proceed any option check: is it valid? 
        // Is arr[i] > arr[i-1]?
        if (isValidOption(nums1, nums2, index)) {
            // we didn't swapped our arr[i], amount of operations the same
            option1 = dfs(nums1, nums2, index + 1, NOT_SWAPPED);
        }

        // swap, dfs and swap again
        swap(nums1, nums2, index);
        int option2 = NOT_VALID;
        if (isValidOption(nums1, nums2, index) && nums1[index] != nums2[index]) {
            // we swapped our arr[i], amount of operations increased by 1
            option2 = dfs(nums1, nums2, index + 1, SWAPPED) + 1;
        }
        swap(nums1, nums2, index);

        // take the minimum amount of operations
        int result = Math.min(option1, option2);
        
        // we have 2 ways to save data:
        // if our PREVIOUS index was swapped hold 0, opposite 1
        memo[index][swapped] = result;
        return result;
    }

    private boolean isValidOption(int[] nums1, int[] nums2, int index) {
        if (index == 0) return true;
        return nums1[index] > nums1[index - 1] && nums2[index] > nums2[index - 1];
    }


    private void swap(int[] arr1, int[] arr2, int i) {
        int temp = arr1[i];
        arr1[i] = arr2[i];
        arr2[i] = temp;
    }
}