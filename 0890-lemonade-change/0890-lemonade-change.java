class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        boolean res=true;
        for(int i=0;i<bills.length;i++)
        {
           h1.put(bills[i],h1.getOrDefault(bills[i], 0) + 1);

            if(bills[i]>5)
            {
                int n=bills[i];
                  n=n-5;
                  while(n!=0)
                  {
                     if(n>10 && h1.get(10)!=null && h1.get(10)!=0)
                     {
                            h1.replace(10,h1.get(10)-1);
                            n=n-10;
                     }
                     if(n>=5 && h1.get(5)!=null && h1.get(5)!=0)
                     {
                        h1.replace(5,h1.get(5)-1);
                        n=n-5;
                     }
                     else
                     {
                        res=false;
                        break;
                     }
                  }
                    
                    
                 
            }
        }
        return res;
    }
}