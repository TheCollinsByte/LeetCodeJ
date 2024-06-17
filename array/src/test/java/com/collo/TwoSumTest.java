package com.collo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {
    private static final Logger LOG = LoggerFactory.getLogger(TwoSumTest.class);

    @Test
    void findPairBruteForce() {
        TwoSum twoSum = new TwoSum();
        int[] pair = twoSum.findPairBruteForce(new int[]{2, 7, 11, 15}, 9);

        LOG.info("Checked Pair: {}", pair);

        assertArrayEquals(pair, new int[]{0, 1});
    }

    @Test
    void hasPairWithSumTwoPointers() {
        TwoSum twoSum = new TwoSum();
        boolean pair = twoSum.hasPairWithSumTwoPointers(new int[]{3, 2, 4}, 6);

        LOG.info("Array Two Candidates: {}", pair);

        assertTrue(pair);
    }

    @Test
    void findPairWithSumHashing() {
        TwoSum twoSum = new TwoSum();
        int[] pair = twoSum.findPairWithSumHashing(new int[]{3, 2, 4}, 6);

        LOG.info("Array Pair Sum: {}", pair);

        assertArrayEquals(pair, new int[]{1, 2});
    }
}
