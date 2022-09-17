package BinarySearch;

public class Main {

    public static void main(String []args) {

        int []array = {1, 3, 5, 10, 11};

        BinarySearch binarySearch = new BinarySearch();

        System.out.println("The Index is :- " +binarySearch.getIndexInSortedArray(array, 10));

        System.out.println("The Index is :- " +binarySearch.getIndexInSortedArray(array, 120));



    }
    /**
     * Solve some problems on Binary Search in LeetCode.
     * https://leetcode.com/problemset/all/?topicSlugs=binary-search&page=1
     */
}
