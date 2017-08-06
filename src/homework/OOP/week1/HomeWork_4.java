package homework.oop.week1;

import java.util.Scanner;

/**
 * 4. Написать калькулятор в виде консольного меню
 * - сложение двух чисел
 * - вычитание двух чисел
 * - умножение двух чисел
 * - деление двух чисел
 */
public class HomeWork_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int iFirstNum = in.nextInt();

        System.out.println("Enter the operation (*, /, +, -): ");
        String sOperation = in.next();

        System.out.print("Enter the second number: ");
        int iSecondNum = in.nextInt();

        int iResult = 0;

        switch (sOperation) {
            case "*":
                iResult = iFirstNum * iSecondNum;
                break;

            case "/":
                iResult = iFirstNum / iSecondNum;
                break;

            case "+":
                iResult = iFirstNum + iSecondNum;
                break;

            case "-":
                iResult = iFirstNum - iSecondNum;
                break;
        }

        System.out.printf("%d %s %d = %d\n", iFirstNum, sOperation, iSecondNum, iResult);
    }
}

