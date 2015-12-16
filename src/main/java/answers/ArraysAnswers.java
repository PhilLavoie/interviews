package answers;

public class ArraysAnswers {

    public int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        int index = reverse.length - 1; //Start from the end.

        for (int element : array) {
            reverse[index] = element;
            index--;
        }
        return reverse;
    }

    public int[] inplaceReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int j = array.length - 1 - i;

            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    //TODO: inplace reverse

    //Have redundant check, possible to use ArrayList to avoid this but then we have ArrayList overhead.
    //both solutions are good.
    public int[] odds(int[] array) {
        int noOdds = 0;

        for (int item : array) {
            if (item % 2 == 1) {
                noOdds++;
            }
        }

        int[] odds = new int[noOdds];

        for (int i = 0, j = 0; i < array.length; i++) {
            int item = array[i];
            if (item % 2 == 1) {
                odds[j] = item;
                j++;
            }
        }

        return odds;
    }

    public boolean contains(int[] array, int element) {
        for (int arrayElement : array) {
            if (arrayElement == element) {
                return true;
            }
        }

        return false;
    }
}
