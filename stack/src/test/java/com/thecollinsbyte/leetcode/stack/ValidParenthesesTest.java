package com.thecollinsbyte.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    void testValidSimpleParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("()"), "Simple valid parentheses");
    }

    @Test
    void testValidMixedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("()[]{}"), "Mixed valid parentheses");
    }

    @Test
    void testValidNestedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("{([])}"), "Nested valid parentheses");
    }

    @Test
    void testEmptyString() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid(""), "Empty string is valid");
    }

    @Test
    void testDeeplyNestedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("(((((((((())))))))))"), "Deeply nested valid parentheses");
    }

    @Test
    void testMismatchedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid("(]"), "Mismatched parentheses");
    }

    @Test
    void testIncorrectlyNestedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid("([)]"), "Incorrectly nested parentheses");
    }

    @Test
    void testUnclosedParentheses() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid("(((((((()"), "Unclosed parentheses");
    }

    @Test
    void testExtraClosingParenthesis() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid("())"), "Extra closing parenthesis");
    }

    @Test
    void testMismatchedAndNestedWrong() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertFalse(validParentheses.isValid("[{]}"), "Mismatched and nested wrong");
    }
}