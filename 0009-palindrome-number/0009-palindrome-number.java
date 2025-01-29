class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int val=x;
        if(x>=0)
        {
            while(x!=0)
            {
                int r=x%10;
                x=x/10;
                sum=sum*10+r;
                System.out.println(sum);
            }
            if(sum==val)
            {
                return true;
            }
        }
        return false;
    }
}