class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        StringBuilder str=new StringBuilder(); 
        for(int i=arr.length-1;i>0;i--)
        {
                str.append(arr[i]+" ");  
        }
        str.append(arr[0]);
        return str.toString();
    }
}