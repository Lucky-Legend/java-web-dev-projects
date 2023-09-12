package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() { assertTrue(true); }
    @Test
    public void validateStarts() { assertTrue(true); }
    @Test
    public void onlyBracketsReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }
    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void fiveBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]["));
    }
    @Test
    public void sevenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][][["));
    }
    @Test
    public void opposingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void doubleOpposingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }
    @Test
    public void messyBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]][[]]"));
    }
    @Test
    public void bracketsContainingWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[something]"));
    }
    @Test
    public void bracketsContainingNumbersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[123451234]"));
    }
    @Test
    public void bracketsContainingSpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ ]"));
    }
}