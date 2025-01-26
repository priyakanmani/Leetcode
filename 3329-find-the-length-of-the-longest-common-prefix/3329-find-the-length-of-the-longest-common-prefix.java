class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String,Integer> prefixMap=new HashMap<>();
        for(int a:arr1)
        {
            String str=Integer.toString(a);
            String prefix="";
            for(char ch:str.toCharArray())
            {
                prefix=prefix+ch;
                prefixMap.put(prefix,prefixMap.getOrDefault(prefix,0)+1);
            }
        }
        int maxLength=0;
        for(int a:arr2)
        {
            String str=Integer.toString(a);
            String prefix="";
            for(char ch:str.toCharArray())
            {
                prefix=prefix+ch;
                if(prefixMap.containsKey(prefix))
                {
                    maxLength=Math.max(maxLength,prefix.length());
                }
            }
        }
        return maxLength;
    }
}