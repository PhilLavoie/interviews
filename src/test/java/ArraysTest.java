import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//No null test just because it's overkill for interview :)
public class ArraysTest {

    private Arrays arrays;

    @Before
    public void setup() {
        arrays = new Arrays();
    }

    @Test
    public void testReverseNormalInput() {
        int[] theInput = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] theExpectedResult = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        assertArrayEquals(theExpectedResult, arrays.reverse(theInput));
    }

    @Test
    public void testReverseEmpty() {
        int[] theInput = new int[0];

        int[] theResult = arrays.reverse(theInput);

        assertEquals(0, theResult.length);
    }

    @Test
    public void testOddsNoOdds() {
        int[] noOdds = new int[] {0, 2, 4, 6, 8, 10};

        int [] result = arrays.odds(noOdds);

        assertEquals(0, result.length);
    }

    @Test
    public void testOddsJustOdds() {
        int[] justOdds = new int[] {1, 3, 5, 7, 9, 11};

        final int[] result = arrays.odds(justOdds);

        assertArrayEquals(justOdds, result);
    }

    @Test
    public void testOddsWithOddsAndEvens() {
        int[] someStuff = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResult = new int[] {1, 3, 5, 7, 9};

        int[] effectiveResult = arrays.odds(someStuff);

        assertArrayEquals(expectedResult, effectiveResult);
    }

    @Test
    public void testOddsEmpty() {
        int[] empty = new int[0];

        int[] result = arrays.odds(empty);

        if (result != null) {
            assertEquals(0, result.length);
        }
    }

    @Test
    public void testContainsEmpty() {
        int[] empty = new int[0];

        assertFalse(arrays.contains(empty, 5));
    }

    @Test
    public void testContainsWhenContains4Real() {
        int[] stuff = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertTrue(arrays.contains(stuff, 5));
    }

    @Test
    public void testContainsWhenDoesntContain4Real() {
        int[] stuff = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertFalse(arrays.contains(stuff, -1));
    }

}
