package homework.Intro.week2;

/**
 * Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class HomeWork_4_7 {
    public static void main(String[] args) {

        int[] iArray = ArrayHelper.generateArrayInt(17);

        ArrayHelper.printArr(iArray);

        int iHalf = iArray.length / 2;

        //create two arrays
        int[] iFirstArr = new int[iHalf];
        int[] iSecondArr = new int[iHalf];

        //if the length of array is odd
        if (iArray.length % 2 != 0) {
            iSecondArr = new int[iHalf + 1];
        }

        //copy values to new arrays
        for (int i = 0; i < iHalf; i++) {
            iFirstArr[i] = iArray[i];
        }

        //start from half of array and go to the end
        int iCount = 0;
        for (int i = iHalf; i < iArray.length ; i++) {
            iSecondArr[iCount] = iArray[i];
            iCount++;
        }

        System.out.println();
        ArrayHelper.printArr(iFirstArr);
        ArrayHelper.printArr(iSecondArr);

        float iSumFirst = ArrayHelper.arithmeticMean(iFirstArr);
        float iSumSecond = ArrayHelper.arithmeticMean(iSecondArr);

        System.out.println("\niSumFirst = " + iSumFirst);
        System.out.println("iSumSecond = " + iSumSecond);

        if (iSumFirst > iSumSecond) {
            System.out.print("\nThe arithmetic mean value of the first half of the array over the second half\n");
            ArrayHelper.printArr(iFirstArr);
        } else {
            System.out.print("\nThe arithmetic mean value of the second half of the array over the first half\n");
            ArrayHelper.printArr(iSecondArr);
        }
    }

}
