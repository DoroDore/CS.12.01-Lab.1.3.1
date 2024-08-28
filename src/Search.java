import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int low = 0, high = array.length -1; //Two dynamic bounds that will be shifted
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == value) {
                return mid; //If it fits!
            }
            else if (array[mid] < value) {
                low = mid + 1; //Think of this like dragging the low point to the right
            }
            else {
                high = mid - 1; //Likewise, the upper point is slid down.
            }

        }
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int low = 0, high = array.length -1;
        while (low <= high) {
            int mid = low + (high - low) /2;
            if (array[mid].equals(string)) {
                return mid;
            }
            else if (array[mid].compareTo(string) < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;

    }
}
