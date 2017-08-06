package homework.Intro.week3;

import java.util.Scanner;

/**
 * 3.9. Умножить две матрицы.
 *
 * Произведение матриц AB состоит из всех возможных комбинаций скалярных произведений вектор-строк матрицы A и вектор-столбцов матрицы B
 */
public class HomeWork_3_9 {
    public static void main(String[] args) {

        System.out.print("Enter the size of square matrix: ");
        Scanner in = new Scanner(System.in);
        int iMatSize = in.nextInt();

        int iRange = 10;
        int[][] iAMat = MatrixHelper.genRanMatrix(iMatSize, iMatSize, iRange);
        int[][] iBMat = MatrixHelper.genRanMatrix(iMatSize, iMatSize, iRange);
        int[][] iCMat = MatrixHelper.genRanMatrix(iMatSize, iMatSize, 1);

        /*int[][] iAMat = {{1,1,5,5,4},
                        {8,7,6,3,8},
                        {0,6,6,9,6},
                        {6,5,3,9,6},
                        {0,7,5,8,7}};

        int[][] iBMat = {{4,7,9,7,1},
                        {2,6,9,1,5},
                        {8,4,2,7,8},
                        {0,4,1,3,9},
                        {6,3,6,6,7}};*/

        //System.out.println(1*4 + 1*2 + 5*8 + 5*0 + 4*6); //{0,0}=70
        //System.out.println(0*9 + 6*9 + 6*2 + 9*1 + 6*6); //{2,2}=111

        System.out.println();
        MatrixHelper.printMatrix(iAMat);
        System.out.println();
        MatrixHelper.printMatrix(iBMat);

        ///////////////////////////////////////
        //the first rows of the matrix is multiplied by the second columns and add up
        int[] iARow, iBColumn;
        int iRow, iColumn;
        int iMatLength = iCMat.length;

        for (int i = 0; i < iMatLength; i++) {

            iARow = new int[iMatLength];
            iRow = i; //row

            for (int c = 0; c < iMatLength; c++) { //moving in columns
                iARow[c] = iAMat[iRow][c]; //iARow stores all string from a iRow
            }

            for (int j = 0; j < iMatLength; j++) {
                iBColumn = new int[iMatLength];

                iColumn = j; //column
                for (int r = 0; r < iMatLength; r++) { //moving in rows
                    iBColumn[r] = iBMat[r][iColumn]; //iBColumn stores all the values ​​from column iColumn
                }

                for (int p = 0; p < iMatLength; p++) {
                    iCMat[iRow][iColumn] += iARow[p] * iBColumn[p];
                }
            }
        }

        System.out.println();
        MatrixHelper.printMatrix(iCMat);
    }
}
