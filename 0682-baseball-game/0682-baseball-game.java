import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop(); // remove last score
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2); // double last score
            } else if (op.equals("+")) {
                int top = stack.pop(); // remove top to access second last
                int newTop = top + stack.peek(); // sum of top + second top
                stack.push(top); // put top back
                stack.push(newTop); // push new score
            } else {
                stack.push(Integer.parseInt(op)); // normal number
            }
        }
        
        // sum all valid scores
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }
}