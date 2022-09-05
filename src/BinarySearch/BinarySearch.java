package BinarySearch;

public class BinarySearch {

    int getIndexInSortedArray(int[] array, int number) {

        int low = 0, high = array.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;
            int index = 0;
            if(array[mid] == number) {
                return mid;
            } else if(array[mid] < number) {
                low = mid + 1;
            } else if(array[mid] > number) {
                high = mid - 1;
            }
        }
        return -1;
    }

}
