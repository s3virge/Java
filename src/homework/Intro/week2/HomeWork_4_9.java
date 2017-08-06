package homework.Intro.week2;

/**
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class HomeWork_4_9 {
    public static void main(String[] args) {

        int iSize = 7;
        int iStart = 25;
        int iEnd = 75;

        int[] iArr1 = ArrayHelper.generateArrFromTo(iSize, iStart, iEnd);
        int[] iArr2 = ArrayHelper.generateArrFromTo(iSize, iStart, iEnd);

        System.out.print("First array -> ");
        ArrayHelper.printArr(iArr1);
        System.out.print("Second array -> ");
        ArrayHelper.printArr(iArr2);

        int iEvenCount1 = ArrayHelper.calcEvenNum(iArr1);
        int iEvenCount2 = ArrayHelper.calcEvenNum(iArr2);

        if (iEvenCount1 > iEvenCount2) {
            System.out.print("More paired elements in the first array");
        } else {
            System.out.printf("More paired elements in the sacond array");
        }
    }
}
