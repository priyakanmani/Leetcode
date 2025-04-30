class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;

        if (nums.length == 1) return true;

        while (i < nums.length) {
            int maxJump = nums[i];

            // if we can directly reach the end
            if (i + maxJump >= nums.length - 1) return true;

            // if current position cannot move forward
            if (maxJump == 0) return false;

            int bestNext = 0;
            int nextIndex = i;

            // look ahead to find the best next jump
            for (int j = 1; j <= maxJump; j++) {
                if (i + j < nums.length && j + nums[i + j] > bestNext) {
                    bestNext = j + nums[i + j];
                    nextIndex = i + j;
                }
            }

            i = nextIndex; // move to the best next position
        }

        return true;
    }
}
