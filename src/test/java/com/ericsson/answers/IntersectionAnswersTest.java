package com.ericsson.answers;

import com.ericsson.Intersections;
import com.ericsson.IntersectionsTest;

public class IntersectionAnswersTest extends IntersectionsTest {

    @Override protected Intersections getImplementation() {
        return new IntersectionAnswers();
    }
}
