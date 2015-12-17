package com.ericsson.answers;

import com.ericsson.Arrays;
import com.ericsson.ArraysTest;

import static org.junit.Assert.*;

public class ArraysAnswersTest extends ArraysTest {

    @Override protected Arrays getImplementation() {
        return new ArraysAnswers();
    }
}
