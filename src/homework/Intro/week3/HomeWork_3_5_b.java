package homework.Intro.week3;

/**
 * 3.5  b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class HomeWork_3_5_b {
    public static void main(String[] args) {
        //receive from the user the number of rows
        int iRowsInMatrix = MatrixHelper.receiveRowCount();
        //receive from the user the number of columns
        int iColInMatrix = MatrixHelper.receiveColumnCount();

        //generate matrix
        int[][] iMat = MatrixHelper.genRanMatrix(iRowsInMatrix, iColInMatrix, 10);
        MatrixHelper.printMatrix(iMat);

        //calculate the sum of each column
        int[] iArrColSum = MatrixHelper.sumElementsInCol(iMat);

        //find index of column where sum is max
        int iMaxColIndex = MatrixHelper.indexOfMax(iArrColSum);
        System.out.printf("Max sum of elements in %d column\n", iMaxColIndex);

        //find index of column where sum is min
        int iMinColIndex = MatrixHelper.indexOfMin(iArrColSum);
        System.out.printf("Min sum of elements in %d column\n", iMinColIndex);

        //swap columns
        iMat = MatrixHelper.swapColumns(iMat, iMaxColIndex, iMinColIndex);

        System.out.println("Now the columns of min and max sum are changed");
        MatrixHelper.printMatrix(iMat);
    }
}
