package com.example.basevalidator;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for Solution.validateBase() method.
 */
class SolutionTest {

    private void doTest(String num, int base, boolean expected) {
        String messageOnFail = String.format("Test failed for num = '%s', base = %d", num, base);
        assertEquals(expected, Solution.validateBase(num, base), messageOnFail);
    }

    @Test
    @DisplayName("Sample validation tests")
    void sampleTests() {
        doTest("61262", 8, true);
        doTest("ABCDEF", 16, true);
        doTest("25172", 5, false);
        doTest("EG", 16, false);
        doTest("W", 32, false);
        doTest("99235", 9, false);
        doTest("009", 10, true);
        doTest("0", 5, true);
    }
}

