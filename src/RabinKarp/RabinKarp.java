package RabinKarp;

public class RabinKarp {

    static  int multiplicationValue = 10;

    public int searchForIndex(String Pattern, String text, int modNumber) {

        int lengthOfPattern = Pattern.length();
        int lengthOfText = text.length();
        int indexOne, indexTwo;
        int powValueOfTextLength = 1;
        int hashValueOfPattern = 0;
        int hashValueOfText = 0;

        // find the initial hash value of pattern

        for(int  index = 0; index < lengthOfPattern - 1; index++) {

            powValueOfTextLength = (powValueOfTextLength * multiplicationValue) % modNumber;
        }

        for(indexOne = 0; indexOne < lengthOfPattern ; indexOne++) {

            hashValueOfPattern = (multiplicationValue * hashValueOfPattern + Pattern.charAt(indexOne)) % modNumber;

            hashValueOfText = (multiplicationValue * hashValueOfText + text.charAt(indexOne)) % modNumber;

        }

        for(indexOne = 0 ; indexOne < lengthOfText - lengthOfPattern; indexOne++) {

            if(hashValueOfPattern == hashValueOfText) {
                for (indexTwo = 0; indexTwo < lengthOfPattern; indexTwo++) {

                    if (text.charAt(indexOne + indexTwo) != Pattern.charAt(indexTwo)) {
                        break;
                    }
                }

                if (indexTwo == lengthOfPattern) {

                    return indexOne + 1;
                }
            }

                    if(indexOne < lengthOfText - lengthOfPattern) {
                        hashValueOfText = (multiplicationValue * (hashValueOfText - text.charAt(indexOne) * powValueOfTextLength) + text.charAt(indexOne + lengthOfPattern)) % modNumber;

                        if(hashValueOfText < 0) {
                            hashValueOfText = (hashValueOfText + modNumber);
                        }
                    }
                }

        return -1;
    }
}
