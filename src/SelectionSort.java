public class SelectionSort {
    private static int findSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(array);

        }

    }
}
