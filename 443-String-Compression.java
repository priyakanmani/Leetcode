class Solution {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        int j=0;
        int count=1;
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==chars[i-1])
            {
                count++;
            }
            else
            {
               str.append(chars[i-1]);
               if(count>1)
               {
               str.append(count);
               }
               count=1;
            }
        }
        str.append(chars[chars.length-1]);
        if(count>1)
        {
            str.append(count);
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}