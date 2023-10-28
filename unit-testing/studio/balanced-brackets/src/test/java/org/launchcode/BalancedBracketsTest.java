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
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }
    @Test
    public void threeBracketsReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["), "three brackets returns false");
    }
    @Test
    public void fiveBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]["), "five brackets returns false");
    }
    @Test
    public void sevenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][][["), "seven brackets returns false");
    }
    @Test
    public void opposingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["), "opposing brackets returns false");
    }
    @Test
    public void doubleOpposingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["), "double opposing brackets returns false");
    }
    @Test
    public void messyBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]][[]]"), "extra closing bracket before opening bracket returns false");
    }
    @Test
    public void bracketsContainingWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[something]"), "brackets containing letters returns true");
    }
    @Test
    public void bracketsContainingNumbersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[123451234]"), "brackets containing numbers returns true");
    }
    @Test
    public void bracketsContainingSpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[   ]"), "brackets containing spaces returns true");
    }
}