package QuickSort;

/**
 * @author tejas.
 */

public class QuickSort {

    /**
     * This method will take the array as the input and sort the array.
     * @param array is the Input array.
     * @param low   starting index.
     * @param high end index.
     */

     static void doQuickSort(int []array, int low, int high) {

        if(low < high) {
            int pivotIndex = doPartition(array, low, high);

            doQuickSort(array, low, pivotIndex - 1);
            doQuickSort(array, pivotIndex + 1, high);
        }

    }

    /**
     * This method takes the array start index and end index as the input.
     * By using pivot element it partitions the array and then sorts the partitioned array.
     * @param array input array.
     * @param startIndex starting index.
     * @param endIndex ending index.
     * @return index of the sorted element .
     */

    static int doPartition(int []array, int startIndex, int endIndex) {

        int pivot = array[startIndex];

        int index = startIndex;
        int jIndex = endIndex;

        while(index < jIndex) {

            while(array[index] <= pivot) {
                index ++;
            }
            while (array[jIndex] > pivot) {

                jIndex--;
            }
            if(index < jIndex) {
                swap(array, index, jIndex);
            }
        }
        swap(array,jIndex, startIndex);

        return jIndex;
    }


    /**
     * Takes the array and the elements index to be swapped.
     * @param array array as the input .
     * @param firstIndex index of the element to be swapped.
     * @param secondIndex index of the element to be swapped.
     */
     static void swap(int []array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
