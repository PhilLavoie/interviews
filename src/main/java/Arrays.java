import answers.ArraysAnswers;

//No static calls on purpose, we extend the answers just to facilitate unit testing.
public class Arrays extends ArraysAnswers {

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

    //TODO: inplace reverse

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
        return null;
    }

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
        return false;
    }

}
