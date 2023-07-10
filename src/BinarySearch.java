public class BinarySearch {
    public static void binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + high;
            int guess = array[mid];
            if (guess == item) {
                System.out.println("Значение " + item + " имеет индекс " + mid);
                return;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Такого элемента в массиве нет!");
    }
}
