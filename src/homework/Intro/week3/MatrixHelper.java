package homework.Intro.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * MatrixHelper Class
 */
public class MatrixHelper {

    static int[][] genRanMatrix(int iNumOfRows, int iNumOfColumns, int iRange) {

        if (iRange <= 0) {
            System.out.print("Range cant be 0");
            return null;
        }

        int[][] iResultArr = new int[iNumOfRows][iNumOfColumns];

        //iResult.length returns number of rows in matrix
        for (int row = 0; row < iResultArr.length; row++) {
            for (int col = 0; col < iResultArr[row].length; col++) { //iResult[row].length - number of columns in row
                iResultArr[row][col] = (int)(Math.random() * iRange);
            }
        }

        //System.out.printf("The length of iResult is %s", Arrays.deepToString(iResultArr));

        return iResultArr;
    }

    static boolean[][] genLogicalMatrix(int iNumOfRows, int iNumOfColumns) {

        boolean[][] bResultArr = new boolean[iNumOfRows][iNumOfColumns];

        for (int row = 0; row < bResultArr.length; row++) {
            for (int col = 0; col < bResultArr[row].length; col++) {
                if(row == col) {
                    bResultArr[row][col] = true;
                }
            }
        }

        return bResultArr;
    }

    //return an array that consists of matrix diagonal
    public static int[] getMatrixDiagonal(int[][] iMatrix) {

        int[] iResultArr = new int[iMatrix.length];

        for (int row_col = 0; row_col < iMatrix.length; row_col++) {
           iResultArr[row_col] = iMatrix[row_col][row_col];
        }

        return iResultArr;
    }

    //return array of sum elements in row
    public static int[] sumElementsInRow(int[][] iMatrix){
        int[] iResArr = new int[iMatrix.length];

        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[row].length; col++) {
                iResArr[row] += iMatrix[row][col]; //calculate sum of elements in a row
            }
        }

        return iResArr;
    }

    public static int[] sumElementsInCol(int[][] iMatrix) {

        //get the number of columns in matrix
        int[] iArrColumnsSum = new int[iMatrix[0].length];

        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[row].length; col++) {
                iArrColumnsSum[col] += iMatrix[row][col]; //calculate sum of elements in a column
            }
        }

        return iArrColumnsSum;
    }

    public static void printMatrix(int[][] matrixToPrint){
        for (int row = 0; row < matrixToPrint.length; row++) {
            for (int col = 0; col < matrixToPrint[row].length; col++) {
                System.out.printf("%3d ", matrixToPrint[row][col]);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String[][] matrixToPrint){
        for (int row = 0; row < matrixToPrint.length; row++) {
            for (int col = 0; col < matrixToPrint[row].length; col++) {
                System.out.printf("%-2s ", matrixToPrint[row][col]);
            }
            System.out.println();
        }
    }

    public static int indexOfMax(int[] iArr){

        int iIndexMax = 0, iMax = iArr[0];

        for (int i = 0; i < iArr.length ; i++) {
            if(iArr[i] > iMax) {
                iMax = iArr[i];
                iIndexMax = i;
            }
        }

        return iIndexMax;
    }

    public static int indexOfMin(int[] iArr){

        int iIndexMin = 0, iMin = iArr[0];

        for (int i = 0; i < iArr.length ; i++) {
            if(iArr[i] < iMin) {
                iMin = iArr[i];
                iIndexMin = i;
            }
        }

        return iIndexMin;
    }

    public static int receiveRowCount() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iNumRows = in.nextInt();

        while(iNumRows <= 1) {
            System.out.println("The number of rows must be greater than 1." +
                    " Please try again");
            System.out.print("Enter number of rows: ");
            iNumRows = in.nextInt();
        }

        return iNumRows;
    }

    public static int receiveColumnCount() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of columns: ");
        int iNumColumns = in.nextInt();

        while(iNumColumns  <= 1) {
            System.out.println("The number of columns must be greater than 1." +
                    " Please try again");

            System.out.print("Enter number of columns: ");
            iNumColumns = in.nextInt();
        }

        return iNumColumns;
    }

    public static int[][] swapRows(int[][] iMatrix, int iFirstRowIndex, int iSecondRowIndex) {

        int[] iTemp = new int[iMatrix[0].length];

        //copy elements to the buffer
        for (int i = 0; i < iMatrix[iFirstRowIndex].length; i++) {
            iTemp[i] = iMatrix[iFirstRowIndex][i];
        }

        //copy elements of second row to first row
        for (int i = 0; i < iMatrix[iSecondRowIndex].length; i++) {
            iMatrix[iFirstRowIndex][i] = iMatrix[iSecondRowIndex][i];
        }

        //recording elements from the buffer in the second row
        for (int i = 0; i < iTemp.length; i++) {
            iMatrix[iSecondRowIndex][i] = iTemp[i];
        }

        return iMatrix;
    }

    public static int[][] swapColumns(int[][] iMatrix, int iFirstColIndex, int iSecondColIndex) {

        int iNumOfRows = iMatrix.length;

        int[] iTemp = new int[iNumOfRows];

        //save to the buffer column with min sum of elements
        for (int i = 0; i < iNumOfRows; i++) {
            iTemp[i] = iMatrix[i][iFirstColIndex];
        }

        //copy column with max sum to the column with min sum
        for (int i = 0; i < iNumOfRows; i++) {
            iMatrix[i][iFirstColIndex] = iMatrix[i][iSecondColIndex];
        }

        //copy elements from buffer to the column with max sum
        for (int i = 0; i < iTemp.length; i++) {
            iMatrix[i][iSecondColIndex] = iTemp[i];
        }

        return iMatrix;
    }

    public static int[] findSequences(char ch, String str) {

        int[] iSeqArr = new int[str.length()]; //массив индексов найденных последовательностей

        int iFirstIndex = 0, iLastIndex = 0;
        int iSeqNum = 0;

        char[] chArray = str.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            //
            if(chArray[i] == ch) {
                iFirstIndex = i; //запоминаем индекс начала последовательности

                if(i <= chArray.length - 1) { // чтобы int j = iFirstIndex + 1 не вылезло за границы массива
                    //наверное это последовательность, смотрим что у нас дальше
                    for (int j = iFirstIndex + 1; j < chArray.length; j++) { //начинаем со следующей ячейки за iFirstIndex

                        if (chArray[j] == ch) {
                            iLastIndex = j;
                            i = iLastIndex;
                        }
                        else {
                            break;
                        }
                    }

                    if (iLastIndex == 0) { //111110
                        //no sequence
                        iFirstIndex = 0;
                    }

                    iSeqArr[iSeqNum] = iFirstIndex;
                    iSeqArr[iSeqNum + 1] = iLastIndex;
                    iSeqNum += 2;
                }
            }
        }

        return Arrays.copyOf(iSeqArr, iSeqNum); //убираем лишнее
    }

    public static int[] findMaxSeq(int[] iSeqArr) {
        int iMax = 0;
        int[] iIndexMaxSeqArr = {0, 0};

        for (int j = 0; j < iSeqArr.length; j += 2) {
            if(iSeqArr[j+1] - iSeqArr[j] > iMax) {
                iMax = iSeqArr[j+1] - iSeqArr[j];
                iIndexMaxSeqArr[0] = iSeqArr[j];
                iIndexMaxSeqArr[1] = iSeqArr[j+1];
            }
        }

        return iIndexMaxSeqArr;
    }

    public static int[][] rotateMatrix(int[][] iMatr, int iAngle) {

        int iMatSize = iMatr.length;
        int[][] iRotetedMatr = new int[iMatSize][iMatSize];
        int[] iRowArr = new int[iMatSize];

        //first row move to the last column
        //at what angle to turn 90, 180, 270, 360, 450
        iAngle /= 90;

        int row;
        int col;

        for (int ang = 0; ang < iAngle; ang++) {

            row = 0;
            col = iMatSize - 1;

            for (int i = 0; i < iMatSize; i++) {
                //read row
                for (int c = 0; c < iMatSize; c++) {
                    iRowArr[c] = iMatr[row][c];
                }

                //write column
                for (int r = 0; r < iMatSize; r++) {
                    iRotetedMatr[r][col] = iRowArr[r];
                }

                row++;
                col--;
            }

            for (int i = 0; i < iMatSize; i++) {
                for (int j = 0; j < iMatSize; j++) {
                    iMatr[i][j] = iRotetedMatr[i][j];
                }
            }
        }

        return iMatr;
    }
}
