class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0)
        {
        List<Integer> l1=new ArrayList<>();
        while(x!=0)
        {
            int r=x%10;
            x=x/10;
            l1.add(r);
        }
        List<Integer> l2=new ArrayList<>(l1);
        Collections.reverse(l1);
        return l1.equals(l2);
        }
        return false;
    }
}