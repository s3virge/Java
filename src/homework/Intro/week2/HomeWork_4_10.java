package homework.Intro.week2;

/**
 * public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
 */
public class HomeWork_4_10 {
    public static void main(String[] args) {
        int[] iArray = ArrayHelper.generateArrayInt(5);

        System.out.print("Have an array: ");
        ArrayHelper.printArr(iArray);

        System.out.print("Split array from index 0 to 4: ");
        //iArray = ArrayHelper.splitArray(iArray, 0, 4);
        ArrayHelper.printArr(ArrayHelper.splitArray(iArray, 0, 4));

        System.out.print("Split array from index 2 to 2: ");
        //iArray = ArrayHelper.splitArray(iArray, 2, 2);
        ArrayHelper.printArr(ArrayHelper.splitArray(iArray, 2, 2));

        System.out.printf("Split array from index -1 to %d: ", iArray.length);
        //iArray = ArrayHelper.splitArray(iArray, -1, iArray.length);
        ArrayHelper.printArr(ArrayHelper.splitArray(iArray, -1, iArray.length));
    }
}
