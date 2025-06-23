class Solution {
    public String stringHash(String s, int k) {
       
       
        StringBuilder str=new StringBuilder();
        int sum=0;
        int i=0;

        while(i<s.length())
        {
            sum=0;
            for(int j=0;j<k;j++,i++)
            {
              
              sum=sum+(s.charAt(i)-97);
              
            }
            str.append((char)((sum%26)+97));
            
           
        }
        
       
        return str.toString();
            
        
    }
}