class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;

        if (nums.length == 1) return true;

        while (i < nums.length) {
            int pos = nums[i];

            // if we can directly reach the end
            if (i + pos >= nums.length - 1) return true;

            // if current position cannot move forward
            if (pos == 0) return false;

            int max = 0;
            int maxpos = i;

            // look ahead to find the best next jump
            for (int j = 1; j <= pos; j++) {
                if (i + j < nums.length && nums[i + j] + j > max) {
                    max = nums[i + j] + j;
                    maxpos = i + j;
                }
            }

            // If we're stuck at same position, return false
            if (maxpos == i) return false;

            i = maxpos; // move to the best next position
        }

        return true;
    }
}
