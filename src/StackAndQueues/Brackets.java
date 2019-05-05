package StackAndQueues;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        solution("(){(}){}");

    }


    public static int solution(String S) {

        if (S.length() == 0) {
            System.out.println("PUSTY" + S);
            return 1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '{') {
                stack.push('}');
            } else if (S.charAt(i) == '[') {
                stack.push(']');
            } else if (S.charAt(i) == '(') {
                stack.push(')');
            } else if (S.charAt(i) == '}' || S.charAt(i) == ']' || S.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    System.out.println("No " + S);
                    return 0;
                }
                char tmp = stack.pop();
                if (tmp != S.charAt(i)){
                    System.out.println("No " + S);
                    return 0;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES " + S);
            return 1;
        }else return 0;


    }

}
