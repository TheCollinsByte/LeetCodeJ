package com.thecollinsbyte.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public Boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Map closing brackets to corresponding opening brackets
        Map<Character, Character> tokens = new HashMap<>();

        tokens.put(')','(' );
        tokens.put('}','{' );
        tokens.put(']','[' );

        // Iterate through the characters in the string
        for(Character token : s.toCharArray()) {
            // If we see a closing bracket
            if (tokens.containsKey(token)) {
                // Stack is empty or top bracket doesn't match
                if(stack.isEmpty() || stack.pop() != tokens.get(token))
                    return false;
            } else {
                // If the current character is an opening bracket, push it to the stack
                stack.push(token);
            }
        }

        // Valid only if all brackets were matched
        return stack.isEmpty();
    }

}
