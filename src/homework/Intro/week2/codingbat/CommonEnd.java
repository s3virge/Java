package homework.Intro.week2.codingbat;

/**
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same
 * last element. Both arrays will be length 1 or more.
 *
 * commonEnd([1, 2, 3], [7, 3]) → true
 * commonEnd([1, 2, 3], [7, 3, 2]) → false
 * commonEnd([1, 2, 3], [1, 3]) → true
 */
public class CommonEnd {
    public static void main(String[] args) {

        int[] iFirstArray = {1, 2, 3};
        //int [] iSecondArray = {7,3};
        int[] iSecondArray = {7, 3, 2};

        boolean bResult = false;

        if (iFirstArray[0] == iSecondArray[0] || iFirstArray[iFirstArray.length - 1] == iSecondArray[iSecondArray.length - 1]) {
            bResult = true;
        }

        System.out.print(bResult);
    }
}
