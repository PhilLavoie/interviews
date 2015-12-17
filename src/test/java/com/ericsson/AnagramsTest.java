package com.ericsson;

import com.ericsson.Anagrams;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsTest {

    private Anagrams anagrams;

    @Before
    public void setup() {
        anagrams = getImplementation();
    }

    protected Anagrams getImplementation() {
        return new Anagrams();
    }

    @Test
    public void testIsAnagramWithLeftHandEmpty() {
        assertFalse(anagrams.isAnagram("", "toto"));
    }

    @Test
    public void testIsAnagramWithRightHandEmpty() {
        assertFalse(anagrams.isAnagram("tutu", ""));
    }

    @Test
    public void testIsAnagramWithBothHandsEmpty() {
        assertTrue(anagrams.isAnagram("", ""));
    }

    @Test
    public void testIsAnagramWithAnagrams() {
        assertTrue(anagrams.isAnagram("daniel neagoe", "eeal oeiangnd"));
    }

    @Test
    public void testIsAnagramWithSameWord() {
        assertTrue(anagrams.isAnagram("roberto", "roberto"));
    }

    @Test
    public void testIsAnagramWithSubset() {
        assertFalse(anagrams.isAnagram("qinan qi", "qinan"));
    }

    @Test
    public void testIsAnagramWithOneChar() {
        assertTrue(anagrams.isAnagram("a", "a"));
    }

    @Test
    public void testIsAnagramOnFalseInputPart1() {
        assertFalse(anagrams.isAnagram("clackmandou", "clockmandou"));
    }

    @Test
    public void testIsAnagramOnFalseInputPart2() {
        assertFalse(anagrams.isAnagram("abcdefg", "hijklmnop"));
    }
}
