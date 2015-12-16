import answers.ArraysAnswers;

//No static calls on purpose, we extend the answers just to facilitate unit testing.
public class Arrays extends ArraysAnswers {

    /**
     * @param array The array possibly containing the element.
     * @param element The element that we want to know if it's in the array or not.
     *
     * @return true if the element is in the array, false otherwise. Returns false on empty arrays.
     *
     * @throws NullPointerException if array is null
     */
    @Override
    public boolean contains(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns an array containing all the odd numbers of the argument.
     *
     * @param array The array to check for odds.
     *
     * @return An array containing all the odds inside the argument. If the array is empty, then an empty array is returned.
     *
     * @throws NullPointerException if array is null
     */
    @Override
    public int[] odds(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        int[] odds = new int[array.length];
        int oddsIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[oddsIndex] = array[i];
                oddsIndex++;
            }
        }
        return odds;
    }

    /**
     * Reverses the array passed as an argument.
     *
     * @param array The array to reverse.
     *
     * @return The reversed view of this array. If the array is empty, then an empty array is returned.
     *
     * @throws NullPointerException if array is null
     */
    @Override
    public int[] reverse(int[] array) {
        return null;
    }

    /**
     * Reverses the array inplace passed as an argument.
     *
     * @param array The array to reverse.
     *
     * @return The reversed view of this array. If the array is empty, then an empty array is returned.
     *
     * @throws NullPointerException if array is null
     */
    @Override public int[] inplaceReverse(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

}
