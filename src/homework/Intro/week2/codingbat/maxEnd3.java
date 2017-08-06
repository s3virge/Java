package homework.Intro.week2.codingbat;

/**
 * Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array.
 *
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

public class maxEnd3 {
    public static void main(String[] args) {

        int[] maxEnd3 = {1, 2, 3};
        //int[] maxEnd3 = {11, 5, 9};
        //int[] maxEnd3 = {2, 11, 3};

        Codingbat.printArray(maxEnd3);
        System.out.println();

        int[] iResultArr = Codingbat.largerBetweenTheFirstAndLast(maxEnd3);

        Codingbat.printArray(iResultArr);
    }
}
