package homework.Intro.week2.codingbat;

/**
 * Given an array of ints length 3, return the sum of all the elements.

 sum3([1, 2, 3]) → 6
 sum3([5, 11, 2]) → 18
 sum3([7, 0, 0]) → 7
 */

public class sum3_test {
    public static void main(String[] args) {

        //int iSum3[] = {1, 2, 3}; //  → 6
        int iSum3[] = {5, 11, 2};// → 18
        //int iSum3[] = {7, 0, 0}; // → 7

        Codingbat.printArray(iSum3);

        int iResultSum = Codingbat.sum3(iSum3);

        System.out.printf("\nSum of all elements = %d", iResultSum);
    }
}
