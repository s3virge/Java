package homework.Intro.week2;

import java.util.Scanner;

/**
 * 2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */
public class HomeWork_7_2_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String str = "This is the test string";
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter symbol: ");
        String chToCalc = sc.next();

        int iNumOfChar = ArrayHelper.calcCharInString(str, chToCalc);

        System.out.printf("In string \'%s\' %d characters %s ", str,  iNumOfChar, chToCalc);
    }
}
