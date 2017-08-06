package homework.Intro.week2;

/**
 * Инвертировать массив (без использования допольнительного массива)
 */
public class HomeWork_7_2_1 {
    public static void main(String[] args) {
        int[] iArr = ArrayHelper.generateArrayInt(2);

        System.out.print("Have an array: \n");
        ArrayHelper.printArr(iArr);

        System.out.print("Inverted array: \n");
        ArrayHelper.printArr(ArrayHelper.invertArray(iArr));
    }
}
