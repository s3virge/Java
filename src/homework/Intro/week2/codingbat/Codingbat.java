package homework.Intro.week2.codingbat;

import java.util.Arrays;

/**
 * my CodingBat methods
 */
public class Codingbat {

    //return true if 6 appears as either the first or last element in the array
    public static boolean checkFirstAndLastCell6(int[] nums) {
        //первый яцейка массива c индексом 0
        int iFirstCell = nums[0];
        //последняя ячейка массива = длинна массива - 1
        int iLastCell = nums[nums.length - 1];

        boolean bResult = false;

        if (iFirstCell == 6 || iLastCell == 6) {
            bResult = true;
        }

        return bResult;
    }

    //---------------------------------------------------------------------------

    //compare the first and last element of the array
    public static boolean firstLastSame(int[] iNums) {
        return (iNums[0] == iNums[iNums.length-1] && iNums.length >= 1);
    }

    //----------------------------------------------------------------------------

    //method shows the array
    public static void printArray(int[] iArrayToPrint) {
        //convert int array to String
        String strArray = Arrays.toString(iArrayToPrint);
        //show given array
        System.out.printf("array %s", strArray);
    }

    //----------------------------------------------------------------------------

    //which is larger between the first and last elements in the array
    public static int[] largerBetweenTheFirstAndLast(int[] iNum) {

        int iLarger = iNum[0];

        if (iLarger < iNum[2]) {
            iLarger = iNum[2];
        }

        for (int c = 0; c < iNum.length; c++) {
            iNum[c] = iLarger;
        }

        return iNum;
    }

    //----------------------------------------------------------------------------

    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    public static int[] makePi() {
        int[] iPi = {3, 1, 4};
        return iPi;
    }

    //----------------------------------------------------------------------------

    //return the sum of all the elements
    public static int sum3(int[] nums) {

        int iSumElem = 0;

        for( int i = 0; i < nums.length; i++) {
            iSumElem = iSumElem + nums[i];
        }
        return iSumElem;
    }

    //---------------------------------------------------------------------------

    public static int[] rotateLeft3(int[] nums) {

        int[] iRotetedArray = new int[3];

        iRotetedArray[0] = nums[1];
        iRotetedArray[1] = nums[2];
        iRotetedArray[2] = nums[0];

        return iRotetedArray;
    }

    //----------------------------------------------------------------------------

    //Given an array of ints, return the sum of the first 2 elements in the array.
    //If the array length is less than 2, just sum up the elements that exist,
    // returning 0 if the array is length 0.

    public static int sum2(int[] iNumSum) {

        if (iNumSum.length == 0){
            return 0;
        }

        int iSum2Elem = iNumSum[0] + iNumSum[1];

        return iSum2Elem;
    }
}
