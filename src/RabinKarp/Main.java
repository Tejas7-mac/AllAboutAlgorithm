package RabinKarp;

public class Main {

    public static void main(String[] args) {

        String text = "ABCCDDAEFG";
        String pattern = "CCD";
        int modValue = 13;

        RabinKarp rabinKarp = new RabinKarp();
        int index = rabinKarp.searchForIndex(pattern, text, modValue);

        if(index < 0) {
            System.out.println("There is no pattern matching with text");
        } else {
            System.out.println(" The pattern is matching at index :- " +index);
        }

    }

    /**
     * solve problems on Rabin karp in leetCode.
     * https://leetcode.com/problemset/all/?page=1&topicSlugs=rolling-hash
     */
}
