package homework.Intro.week2;

/**
 * 3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class HomeWork_4_3 {
    public static void main(String[] args) {

        int iArrSize = 10;
        //create new array
        int iFirstArr[] = ArrayHelper.generateArrayInt(iArrSize);
        int iSecondArr[] = ArrayHelper.generateArrayInt(iArrSize);

        System.out.println("Have two arrays");
        ArrayHelper.printArr(iFirstArr);
        ArrayHelper.printArr(iSecondArr);

        //copy first array to second
        for (int i = 0; i < iArrSize; i++) {
            iSecondArr[i] = iFirstArr[i];
        }

        System.out.println("\nNow both arrays the same");
        ArrayHelper.printArr(iFirstArr);
        ArrayHelper.printArr(iSecondArr);
    }
}
