class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String arr[]=s.trim().split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder str1=new StringBuilder(arr[i]);
            str1.reverse();
            if(i!=arr.length-1)
            {
            str.append(str1+" ");
            }
            if(i==arr.length-1)
            {
                str.append(str1);
            }
        }
        return str.toString();
    }
}