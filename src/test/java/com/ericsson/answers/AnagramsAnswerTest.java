package com.ericsson.answers;

import com.ericsson.Anagrams;
import com.ericsson.AnagramsTest;

import static org.junit.Assert.*;

public class AnagramsAnswerTest extends AnagramsTest {

    @Override protected Anagrams getImplementation() {
        return new AnagramsAnswer();
    }
}
