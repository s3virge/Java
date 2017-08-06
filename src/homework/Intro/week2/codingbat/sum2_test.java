package homework.Intro.week2.codingbat;

/**
 * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

 sum2([1, 2, 3]) → 3
 sum2([1, 1]) → 2
 sum2([1, 1, 1, 1]) → 2
 */

public class sum2_test {
    public static void main(String[] args) {

        //int[] iSum2 = {1, 2, 3};
        //int[] iSum2 = {1, 1};
        //int[] iSum2 = {1, 1, 1, 1};
        int[] iSum2 = new int[0];

        System.out.print("Given an array -> " );
        Codingbat.printArray(iSum2);

        int iArrSum = Codingbat.sum2(iSum2);

        if (iArrSum == 0) {
            System.out.print("\nArray size is equal 0");
        } else {
            System.out.printf("\nSum of two elements of array = %d", iArrSum);
        }
    }
}
