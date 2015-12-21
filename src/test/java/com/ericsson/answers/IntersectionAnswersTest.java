package com.ericsson.answers;

import com.ericsson.Intersections;
import com.ericsson.IntersectionsTest;

import static org.junit.Assert.*;

public class IntersectionAnswersTest extends IntersectionsTest {

    @Override protected Intersections getImplementation() {
        return new IntersectionAnswers();
    }
}
