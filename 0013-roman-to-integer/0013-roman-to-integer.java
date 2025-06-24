class Solution {
    public int romanToInt(String s) {
        int count=0;
         if(s.charAt(0)=='I')
            {
                count=count+1;
            }
            else if(s.charAt(0)=='V')
            {
                count=count+5;
            }
            else if(s.charAt(0)=='X')
            {
                count=count+10;
            }
            else if(s.charAt(0)=='L')
            {
                count=count+50;
            }
            else if(s.charAt(0)=='C')
            {
                count=count+100;
            }
            else if(s.charAt(0)=='D')
            {
                count=count+500;
            }
            else if(s.charAt(0)=='M')
            {
                count=count+1000;
            }
        for(int i=1;i<s.length();i++)
        {
        
            if(s.charAt(i)=='V' && s.charAt(i-1)=='I')
            {
                count=count+3;
            }
            else if(s.charAt(i)=='X' && s.charAt(i-1)=='I')
            {
                count=count+8;
            }
             else if(s.charAt(i)=='L' && s.charAt(i-1)=='X')
            {
                count=count+30;
            }
             else if(s.charAt(i)=='C' && s.charAt(i-1)=='X')
            {
                count=count+80;
            }
             else if(s.charAt(i)=='D' && s.charAt(i-1)=='C')
            {
                count=count+300;
            }
             else if(s.charAt(i)=='M' && s.charAt(i-1)=='C')
            {
                count=count+800;
            }
            
            else if(s.charAt(i)=='I')
            {
                count=count+1;
            }
            else if(s.charAt(i)=='V')
            {
                count=count+5;
            }
            else if(s.charAt(i)=='X')
            {
                count=count+10;
            }
            else if(s.charAt(i)=='L')
            {
                count=count+50;
            }
            else if(s.charAt(i)=='C')
            {
                count=count+100;
            }
            else if(s.charAt(i)=='D')
            {
                count=count+500;
            }
            else if(s.charAt(i)=='M')
            {
                count=count+1000;
            }
            
        }
        return count;
    }
}