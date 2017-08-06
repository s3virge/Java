package homework.Intro.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class HomeWork_3_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iNumOfRows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int iNumOfColumns = in.nextInt();

        boolean[][] bMatrix = MatrixHelper.genLogicalMatrix(iNumOfRows, iNumOfColumns);

        System.out.println(Arrays.deepToString(bMatrix));
    }
}
