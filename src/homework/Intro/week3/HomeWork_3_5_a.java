package homework.Intro.week3;

/**
 * 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 */

public class HomeWork_3_5_a {
    public static void main(String[] args) {

        //receive from the user the number of rows
        int iRowsInMatrix = MatrixHelper.receiveRowCount();
        //receive from the user the number of columns
        int iColInMatrix = MatrixHelper.receiveColumnCount();

        //generate matrix
        int[][] iMat = MatrixHelper.genRanMatrix(iRowsInMatrix, iColInMatrix, 10);
        MatrixHelper.printMatrix(iMat);
        
        //calculate the sum of each row
        int[] iArrRowSum = MatrixHelper.sumElementsInRow(iMat);

        //find index of row where sum is max
        int iMaxRowIndex = MatrixHelper.indexOfMax(iArrRowSum);
        System.out.printf("Max sum of elements in %d row\n", iMaxRowIndex);

        //find index of row where sum is min
        int iMinRowIndex = MatrixHelper.indexOfMin(iArrRowSum);
        System.out.printf("Min sum of elements in %d row\n", iMinRowIndex);

        //int iLen = iMat.length; //number of rows
        //int iLength = iMat[0].length; //number of columns

        //swap rows
        iMat = MatrixHelper.swapRows(iMat, iMinRowIndex, iMaxRowIndex);

        System.out.println("Now the rows of min and max sum are changed");
        MatrixHelper.printMatrix(iMat);
    }
}
