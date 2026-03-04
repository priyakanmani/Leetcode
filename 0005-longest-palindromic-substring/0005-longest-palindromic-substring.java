class Solution {
    public String longestPalindrome(String s) {
        int Max=0;
    String res=" ";
    for(int i=0;i<s.length();i++)
    {
        for(int j=i;j<s.length();j++)
        {
            String substring=s.substring(i,j+1);
            
            int left=0,right=substring.length()-1,flag=0;
            while(left<right)
            {
                if(substring.charAt(left)!=substring.charAt(right))
                {
                    flag=1;
                    break;
                }
                left++;
                right--;
            }
            if(flag==0 && substring.length()>Max)
            {
                res=substring;
                Max=substring.length();
            }
        }
    }
    return res;
    }
}