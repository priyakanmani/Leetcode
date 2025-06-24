class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> h1 = new LinkedHashMap<>();
        StringBuilder str=new StringBuilder();
        h1.put(1000,"M");
        h1.put(900,"CM");
        h1.put(500,"D");
        h1.put(400,"CD");
        h1.put(100,"C");
        h1.put(90,"XC");
        h1.put(50,"L");
        h1.put(40,"XL");
        h1.put(10,"X");
        h1.put(9,"IX");
        h1.put(5,"V");
        h1.put(4,"IV");
        h1.put(1,"I");
        for(int h:h1.keySet())
        {
            if(num==0)
            {
                break;
            }
            
            while(num>=h)
            {
                str.append(h1.get(h));
                num=num-h;
            }
            
        }
        return str.toString();
    }
}