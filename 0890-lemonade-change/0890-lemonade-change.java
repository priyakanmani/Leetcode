class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        boolean res=true;
        for(int i=0;i<bills.length;i++)
        {
           h1.put(bills[i],h1.getOrDefault(bills[i], 0) + 1);

            if(bills[i]!=5)
            {
                int n=bills[i];
                  n=n-5;
                
                    if(n==15)
                    {
                       if ((h1.get(10) == null || h1.get(10) == 0) || (h1.get(5) == null || h1.get(5) == 0))

                        {
                            if((h1.get(10) == null || h1.get(10) == 0) && h1.get(5)!=null && (h1.get(5)>=3))
                            {
                               res=true;
                               
                               int v2=h1.get(5);
                            
                                h1.replace(5,v2-3);
                        
                            }
                            else
                            {
                                res=false;
                                break;
                            }
                            
                        }
                        else
                        {
                            int v1=h1.get(10);
                            int v2=h1.get(5);
                            h1.replace(10,v1-1);
                            h1.replace(5,v2-1);
                        }
                    }
                    else if(n==5)
                    {
                       
                        if(h1.get(5)==null||h1.get(5)==0)
                        {
                            res=false;
                            break;
                        }
                        else
                        {
                            int v=h1.get(5);
                            h1.replace(5,v-1);
                        }
                    }
                    
                 
            }
        }
        return res;
    }
}