package tutorials.stacks;

import java.util.Stack;

public class BalanceParenthesis {

    public static void main(String[] args) {

    }

    public int balanceParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if(c == ')') {
                if(!stack.isEmpty() || stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        return stack.size();
//        int count = 0;
//        while (!stack.isEmpty()) {
//            stack.pop();
//            count += 1;
//        }
//        return count;
    }
}
