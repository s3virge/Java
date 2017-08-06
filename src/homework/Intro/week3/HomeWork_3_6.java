package homework.Intro.week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.6. Нули

 Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

 Вход:
 10001101001

 Выход:
 (2,4) - цепочка нулей
 (5,6) - цепочка единиц
 */
public class HomeWork_3_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sequence of 1 and 0: ");
        String str = in.next();

        int[] iSeqArr0 = MatrixHelper.findSequences('0', str);
        int[] iSeqArr1 = MatrixHelper.findSequences('1', str);

        int[] iMaxSeq0 = MatrixHelper.findMaxSeq(iSeqArr0);
        int[] iMaxSeq1 = MatrixHelper.findMaxSeq(iSeqArr1);

        System.out.printf("%s - sequebce of 0", Arrays.toString(iMaxSeq0));
        System.out.println();
        System.out.printf("%s - sequebce of 1", Arrays.toString(iMaxSeq1));
    }
}
