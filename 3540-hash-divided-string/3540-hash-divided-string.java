class Solution {
    public String stringHash(String s, int k) {
        HashMap<Character,Integer> h1=new HashMap<>();
       
        StringBuilder str=new StringBuilder();
        int sum1=0;
        int i=0;

        while(i<s.length())
        {
            
            for(int j=0;j<k;j++,i++)
            {
              h1.put(s.charAt(i),s.charAt(i)-97);
              sum1=sum1+(s.charAt(i)-97);
              
            }
            str.append((char)((sum1%26)+97));
            sum1=0;
            h1.clear();
        }
        
       
        return str.toString();
            
        
    }
}