package homework.Intro.week2;

/**
 * 2) Поменять местами наибольший
 и наименьший элементы в массиве
 */
public class HomeWork_4_2 {
    public static void main(String[] args) {

        //create an array of ints
        int[] iMas = ArrayHelper.generateArrayInt(10);

        int iHighest = iMas[0], iHighestIndex = 0;
        //find the highest and its index
        for (int i = 0; i < iMas.length; i++) {
            if (iMas[i] > iHighest) {
                iHighest = iMas[i];
                iHighestIndex = i;
            }
        }

        //find the least and its index
        int iLowest = iMas[0], iLowestIndex = 0;
        for (int i = 0; i < iMas.length ; i++) {
            if (iMas[i] < iLowest) {
                iLowest = iMas[i];
                iLowestIndex = i;
            }
        }

        //show the array
        ArrayHelper.printArr(iMas);
        System.out.printf("Highest = %d, index = %d", iHighest, iHighestIndex );
        System.out.printf("\nLowest = %d, index = %d\n", iLowest, iLowestIndex );

        //swap the highest with the lowest
        int iBuff = iMas[iHighestIndex];
        iMas[iHighestIndex] = iMas[iLowestIndex];
        iMas[iLowestIndex] = iBuff;

        //show new array
        ArrayHelper.printArr(iMas);
    }
}
