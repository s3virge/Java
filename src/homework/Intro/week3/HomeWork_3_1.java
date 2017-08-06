package homework.Intro.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. Матрицы генерировать случайными числами и размер матрицы вводит юзер.
 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class HomeWork_3_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iNumOfRows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int iNumOfColumns = in.nextInt();

        int[][] iMatrix = MatrixHelper.genRanMatrix(iNumOfRows, iNumOfColumns, 100);

        int iReplaced = 0; //how many numbers was been replaced
        for (int iRow = 0; iRow < iMatrix.length; iRow++) {
            for (int iCol = 0; iCol < iMatrix[iRow].length; iCol++) {
                if(iMatrix[iRow][iCol] % 5 == 0) {
                    iMatrix[iRow][iCol] = 8;
                    iReplaced++;
                }
            }
        }

        System.out.println(Arrays.deepToString(iMatrix));
        System.out.printf("%d values has been replaced ", iReplaced);
    }
}
