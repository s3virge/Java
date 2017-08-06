package homework.Intro.week2;

/**
 * Найти среднее арифметическое массива
 */
public class HomeWork_4_6 {
    public static void main(String[] args) {

        int iArray[] = ArrayHelper.generateArrayInt(3);

        ArrayHelper.printArr(iArray);

        double iArithMean = ArrayHelper.arithmeticMean(iArray);

        System.out.printf("The arithmetic mean of the array = %d", iArithMean);
    }
}
