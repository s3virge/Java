package homework.Intro.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *3.4. Создать массив, который будет состоять из диагонали матрици
 */
public class HomeWork_3_4 {
    public static void main(String[] args) {

        System.out.print("Enter matrix length: ");

        Scanner in = new Scanner(System.in);
        int iMatSize = in.nextInt();

        //generate square matrix
        int[][] iSquareMatr = MatrixHelper.genRanMatrix(iMatSize, iMatSize, 100);

        MatrixHelper.printMatrix(iSquareMatr);

        //Create an array that consists of matrix diagonal
        int[] iDiagonalArray = MatrixHelper.getMatrixDiagonal(iSquareMatr);

        System.out.print("The array of matrix diagonal is -> ");
        System.out.print(Arrays.toString(iDiagonalArray));
    }
}
