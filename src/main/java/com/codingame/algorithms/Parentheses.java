package com.codingame.algorithms;

import java.util.Stack;

public class Parentheses {


        public static void main(String... args) {
            Stack<String> stack = new Stack<>();
            stack.push("Imane");
            stack.push("Test");
            stack.push("ayoub");

            stack.pop();
            System.out.println(stack.peek());

            String phrase1 = "([])";
            String phrase100 = "([)]";

            // System.out.println(Parentheses.estParenthese(phrase1));

            String phrase2 = "()(";
            System.out.println(Parentheses.estParenthese(phrase2));

            String phrase3 = "(())(";
            System.out.println(Parentheses.estParenthese(phrase3));

        }

        public static boolean estParenthese(String phrase) {
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == '(') {
                    stack.push(")");
                }
                else if (phrase.charAt(i) == '[') {
                    stack.push("]");
                }

                else if (phrase.charAt(i) == ')') {
                    if (stack.isEmpty() || !stack.peek().equals(")")  ) {
                        return false;
                    } else{
                        stack.pop();
                    }
                }else if (phrase.charAt(i) == ']') {
                    if (stack.isEmpty() || !stack.peek().equals("]")  ) {
                        return false;
                    } else{
                        stack.pop();
                    }
                }

            }
            if (!stack.empty() || stack.size() != 0) {
                return false;
            }
            return true;
        }

}
