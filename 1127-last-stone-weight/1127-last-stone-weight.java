class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1)
        {
            Arrays.sort(stones);
            stones[n-2]=stones[n-1]-stones[n-2];
            n--;
        }
        return stones[0];
    }
}