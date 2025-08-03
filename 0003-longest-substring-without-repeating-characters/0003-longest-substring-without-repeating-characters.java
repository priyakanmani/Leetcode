class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h1=new HashSet<>();
        int left=0,right=0,max=0;
        while(right<s.length())
        {
            if(!h1.contains(s.charAt(right)))
            {
                h1.add(s.charAt(right));
                max=Math.max(max,right-left+1);
                right++;
            }
            else
            {
                h1.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}