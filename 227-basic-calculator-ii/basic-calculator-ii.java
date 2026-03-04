

class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char operator = '+';
        int length = s.length();

        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            
            if (Character.isDigit(currentChar)) {
                currentNum = currentNum * 10 + (currentChar - '0');
            }
            
            // Process number when an operator is reached or at the end of the string
            if ((!Character.isDigit(currentChar) && currentChar != ' ') || i == length - 1) {
                if (operator == '+') {
                    stack.push(currentNum);
                } else if (operator == '-') {
                    stack.push(-currentNum);
                } else if (operator == '*') {
                    stack.push(stack.pop() * currentNum);
                } else if (operator == '/') {
                    stack.push(stack.pop() / currentNum);
                }
                operator = currentChar;
                currentNum = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
