package homework.Intro.week2;

/**
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class HomeWork_4_8 {
    public static void main(String[] args) {

        int iSize = 9;

        int[] iFirstArray = ArrayHelper.generateArrayInt(iSize);
        int[] iSecondArray = ArrayHelper.generateArrayInt(iSize);
        int[] iThirdArray = new int[iSize];

        for (int i = 0; i < iSize; i++) {
            iThirdArray[i] = iFirstArray[i] + iSecondArray[i];
        }

        ArrayHelper.printArr(iFirstArray);
        ArrayHelper.printArr(iSecondArray);

        System.out.println("After operation arr1[i] + arr2[i] have an array with values ");
        ArrayHelper.printArr(iThirdArray);
    }
}
