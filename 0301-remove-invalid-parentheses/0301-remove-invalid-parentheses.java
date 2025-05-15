class Solution {
    private List<String> validExpressions = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {
        int extraOpen = 0, extraClose = 0;

        // Count the number of misplaced open and close parentheses
        for (char c : s.toCharArray()) {
            if (c == '(') {
                extraOpen++;
            } else if (c == ')') {
                if (extraOpen > 0) {
                    extraOpen--;
                } else {
                    extraClose++;
                }
            }
        }

        // Start DFS to generate valid expressions
        backtrack(s, 0, new char[s.length() - extraOpen - extraClose], 0, extraOpen, extraClose, 0);
        return validExpressions;
    }

    private void backtrack(String s, int index, char[] curr, int currIndex, int openRem, int closeRem, int balance) {
        // Base case: Stop if constraints are violated
        if (openRem < 0 || closeRem < 0 || balance < 0) return;

        // If we have processed the entire string
        if (index == s.length()) {
            if (openRem == 0 && closeRem == 0) {
                validExpressions.add(new String(curr));
            }
            return;
        }

        char c = s.charAt(index);

        // Option 1: Remove '(' if available
        if (c == '(' && openRem > 0 && (currIndex == 0 || curr[currIndex - 1] != '(')) {
            backtrack(s, index + 1, curr, currIndex, openRem - 1, closeRem, balance);
        }

        // Option 2: Remove ')' if available
        if (c == ')' && closeRem > 0 && (currIndex == 0 || curr[currIndex - 1] != ')')) {
            backtrack(s, index + 1, curr, currIndex, openRem, closeRem - 1, balance);
        }

        // Option 3: Keep the current character
        if (currIndex < curr.length) {
            curr[currIndex] = c;
            int newBalance = balance;

            if (c == '(') newBalance++;
            else if (c == ')') newBalance--;

            backtrack(s, index + 1, curr, currIndex + 1, openRem, closeRem, newBalance);
        }
    }
}