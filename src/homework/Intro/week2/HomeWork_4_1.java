package homework.Intro.week2;

/**
 * 4. Массив создается с помощью метода в классе ArrayUtils

 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */

//import static ArrayHelper.*;

public class HomeWork_4_1 {
    public static void main(String[] args) {

        int[] iArray = ArrayHelper.generateArrayInt(100);

        ArrayHelper.printArr(iArray);

        //find min value
        int iMin = ArrayHelper.findMin(iArray);
        //find max
        int iMax = ArrayHelper.findMax(iArray);

        System.out.println("min = " + iMin + "\nmax = " + iMax);
    }
}