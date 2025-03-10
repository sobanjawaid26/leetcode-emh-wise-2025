package org.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_Valid_Parentheses {

    public static void main(String[] args) {
        String str = "()[]{}";

        boolean isValid = isValid(str);
        System.out.println("isValid : " + isValid);
    }

    public static boolean isValid(String str) {

        if(str.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else if(stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    /*

    20. Valid Parentheses

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.


    Example 1:

    Input: s = "()"

    Output: true

    Example 2:

    Input: s = "()[]{}"

    Output: true

    Example 3:

    Input: s = "(]"

    Output: false

    Example 4:

    Input: s = "([])"

    Output: true



    Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
     */
}
