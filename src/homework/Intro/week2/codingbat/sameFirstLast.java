package homework.Intro.week2.codingbat;

/**
 Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

 sameFirstLast([1, 2, 3]) → false
 sameFirstLast([1, 2, 3, 1]) → true
 sameFirstLast([1, 2, 1]) → true
 */

public class sameFirstLast {
    public static void main(String[] args) {

        int[] iArray = {1, 2, 3};
        //int[] iArray = {1, 2, 3, 1};
        //int[] iArray = {1, 2, 1};

        Codingbat.printArray(iArray);

        System.out.print(Codingbat.firstLastSame(iArray));
    }
}
