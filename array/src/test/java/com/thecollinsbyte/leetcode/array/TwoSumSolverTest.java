package com.collo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumSolverTest {
    private static final Logger LOG = LoggerFactory.getLogger(TwoSumSolverTest.class);

    @Test
    void findPairBruteForce() {
        TwoSumSolver twoSumSolver = new TwoSumSolver();
        int[] pair = twoSumSolver.findPairBruteForce(new int[]{2, 7, 11, 15}, 9);

        LOG.info("Checked Pair: {}", pair);

        assertArrayEquals(pair, new int[]{0, 1});
    }

    @Test
    void hasPairWithSumTwoPointers() {
        TwoSumSolver twoSumSolver = new TwoSumSolver();
        boolean pair = twoSumSolver.hasPairWithSumTwoPointers(new int[]{3, 2, 4}, 6);

        LOG.info("Array Two Candidates: {}", pair);

        assertTrue(pair);
    }

    @Test
    void findPairWithSumHashing() {
        TwoSumSolver twoSumSolver = new TwoSumSolver();
        int[] pairOne = twoSumSolver.findPairWithSumHashing(new int[]{3, 2, 4}, 6);
        int[] pairTwo = twoSumSolver.findPairWithSumHashing(new int[]{2, 7, 11, 15}, 9);

        LOG.info("Array Pair Sum: {}", pairOne);
        LOG.info("Array Pair Sum: {}", pairTwo);

        assertArrayEquals(pairOne, new int[]{1, 2});
        assertArrayEquals(pairTwo, new int[]{0, 1});
    }
}
