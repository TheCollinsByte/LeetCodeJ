package com.collo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private static final Logger LOG = LoggerFactory.getLogger(TwoSumTest.class);

    @Test
    void checkPair() {
        TwoSum twoSum = new TwoSum();
        int[] pair = twoSum.checkPair(new int[]{2, 7, 11, 15}, 9);

        LOG.info("Checked Pair: {}", pair);

        assertArrayEquals(pair, new int[]{0, 1});
    }

    @Test
    void hasArrayTwoCandidates() {
        TwoSum twoSum = new TwoSum();
        int[] pair = twoSum.twoSum(new int[]{3, 2, 4}, 6);

        LOG.info("Array Two Candidates: {}", pair);

        assertArrayEquals(new int[]{0, 2}, pair);
    }
}
