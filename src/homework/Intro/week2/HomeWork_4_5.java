package homework.Intro.week2;

/**
 * Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class HomeWork_4_5 {
    public static void main(String[] args) {

        int[] iRandomArr = new int[20];

        int iEvenNum;
        int iOddNum;

        for (int i = 0; i < iRandomArr.length; i++) {

            //generate even number
            iEvenNum = 1;
            while (iEvenNum % 2 != 0 ) {
                iEvenNum = (int)(Math.random()*100);
            }

            //generate odd number
            iOddNum = 0;
            while (iOddNum % 2 == 0) {
                iOddNum = (int)(Math.random()*100);
            }

            //if index is even number
            if (i % 2 == 0) {
                iRandomArr[i] = iEvenNum;
            } else {
                iRandomArr[i] = iOddNum;
            }
        }

        ArrayHelper.printArr(iRandomArr);
    }
}
