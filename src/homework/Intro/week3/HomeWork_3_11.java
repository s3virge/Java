package homework.Intro.week3;

import java.util.Scanner;

/**
 * 3.11*. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.
 */
public class HomeWork_3_11 {
    public static void main(String[] args) {

        System.out.print("Enter the size of square matrix: ");

        Scanner in = new Scanner(System.in);
        int iMatSize = in.nextInt();

        int iRange = 10;
        int[][] iMatrix = MatrixHelper.genRanMatrix(iMatSize, iMatSize, iRange);
        //int[][] iMatrix = {{1, 2},{4, 3}};

        MatrixHelper.printMatrix(iMatrix);

        System.out.print("Enter the angle at which to rotate the matrix (90, 180, 270, 360, 450): ");
        int iAngle = in.nextInt();

        iMatrix = MatrixHelper.rotateMatrix(iMatrix, iAngle);

        System.out.printf("Matrix after rotating %d degrees\n", iAngle);
        MatrixHelper.printMatrix(iMatrix);
    }
}
