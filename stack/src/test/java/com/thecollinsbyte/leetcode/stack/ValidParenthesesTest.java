package com.thecollinsbyte.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        Boolean result = validParentheses.isValid("{([])}");
        assertTrue(result);
    }
}