package homework.Intro.week2.codingbat;

/**
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.

 firstLast6([1, 2, 6]) → true
 firstLast6([6, 1, 2, 3]) → true
 firstLast6([13, 6, 1, 2, 3]) → false
 */

public class FirstLast6 {
    public static void main(String[] args) {

        int [] iArray = {13, 6, 1, 2, 6};
        //int [] iArray = {6, 1, 2, 3};
        //int [] iArray = {13, 6, 1, 2, 3};

        Codingbat.printArray(iArray);

        boolean bResult = Codingbat.checkFirstAndLastCell6(iArray);

        System.out.printf(" -> %b", bResult);
    }
}
