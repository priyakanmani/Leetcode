class Solution {
    public String longestPalindrome(String s) {
        String result=" ";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String str=s.substring(i,j+1);
                int l=0,r=str.length()-1,flag=0;
                while(l<r)
                {
                    if(str.charAt(l)==str.charAt(r))
                    {
                        l++;
                        r--;
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    if(str.length()>max)
                    {
                        max=str.length();
                        result=str;
                    }
                }
            }
        }
        return s.length()>1?result:s;
    }
}