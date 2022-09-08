package QuickSort;

public class Main {

    public static void main(String []args) {

        int []inputArray = {4,6,2,5,7,9,1,3};

        QuickSort quickSort = new QuickSort();

        quickSort.doQuickSort(inputArray, 0, inputArray.length - 1);

        for (int number : inputArray) {
            System.out.println(number);
        }
        System.out.println(inputArray.toString());


    }
}
