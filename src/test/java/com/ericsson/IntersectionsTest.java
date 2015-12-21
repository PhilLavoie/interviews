package com.ericsson;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.*;

public class IntersectionsTest {

    private Intersections intersections;

    @Before
    public void setUp() {
        intersections = getImplementation();
    }

    protected Intersections getImplementation() {
        return new Intersections();
    }

    @Test
    public void testIntersectionsLeftHandEmpty() {
        List<String> firstWords = newArrayList();
        List<String> secondWords = newArrayList("toto", "tata", "tutu");

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(intersection.isEmpty());
    }

    @Test
    public void testInsectionsRightHandEmpty() {
        List<String> firstWords = newArrayList("toto", "tata", "tutu");
        List<String> secondWords = newArrayList();

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(intersection.isEmpty());
    }

    @Test
    public void testIntersectionsBothEmpty() {
        List<String> firstWords = newArrayList();
        List<String> secondWords = newArrayList();

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(intersection.isEmpty());
    }

    @Test
    public void testIntersectionsSubsetOnLeft() {
        List<String> firstWords = newArrayList("toto", "tutu", "raymond");
        List<String> secondWords = newArrayList("grandpops", "toto", "grandma", "raymond");

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(resultContentEquals(intersection, "toto", "raymond"));
    }

    @Test
    public void testIntersectionsSubsetOnRight() {
        List<String> firstWords = newArrayList("grandpops", "toto", "grandma", "raymond");
        List<String> secondWords = newArrayList("toto", "tutu", "raymond");

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(resultContentEquals(intersection, "toto", "raymond"));
    }

    @Test
    public void testIntersectionContentEqualsLists() {
        List<String> firstWords = newArrayList("toto", "tata", "tutu");
        List<String> secondWords = newArrayList("tata", "toto", "tutu");

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(resultContentEquals(intersection, "tata",  "toto", "tutu"));
    }

    @Test
    public void testSubsetWithDuplicates() {
        List<String> firstWords = newArrayList("raymond", "grandpops", "toto", "grandma", "raymond");
        List<String> secondWords = newArrayList("toto", "tutu", "raymond");

        Set<String> intersection = intersections.intersection(firstWords, secondWords);
        assertTrue(resultContentEquals(intersection, "toto", "raymond"));
    }

    private boolean resultContentEquals(Set<String> result, String... expectedResult) {
        HashSet<String> resultClone = new HashSet<>(result);
        for (String word: expectedResult) {
            if (!resultClone.contains(word)) {
                return false;
            }
            resultClone.remove(word);
        }

        return resultClone.isEmpty();
    }

}
