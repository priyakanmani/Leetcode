class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int currentnumber=0;
        int sign=1;
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                currentnumber=currentnumber*10+(ch-'0');
            }
            else if(ch=='+')
            {
                result=result+sign*currentnumber;
                sign=1;
                currentnumber=0;
            }
            else if(ch=='-')
            {
                result=result+sign*currentnumber;
                sign=-1;
                currentnumber=0;
            }
            else if(ch=='(')
            {
                stack.push(result);
                stack.push(sign);
                result=0;
                sign=1;
            }
            else if(ch==')')
            {
                result=result+sign*currentnumber;
                result=result*stack.pop();
                result=result+stack.pop();
                currentnumber=0;
            }
        }
        result=result+sign*currentnumber;
        return result;
    }
}