package homework.Intro.week2;

import java.util.Scanner;

/**
 * Проерить является ли число простым
 * Просто́е число́ — натуральное (целое положительное) число,
 * имеющее ровно два различных натуральных делителя — единицу и самого себя.
 * Другими словами, число p является простым, если оно больше 1 и при этом делится без остатка только на 1 и на p (на самого себя).
 */
public class HomeWork_7_2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1 (-1 for quit): ");
        int intNumber = sc.nextInt();

        boolean bPrimeNumber = true;

        while (intNumber != -1) {
            if (intNumber > 1) {

                //проверяем делится ли число без остатка на другие числа кроме 1 и самого себя
                //на большее число без остатка делится не может
                for (int i = intNumber - 1; i > 1 ; i--) {
                    //если делится без остатака на другое чило кроме сябя и еденицы
                    //то число не простое, а составное
                    if (intNumber % i == 0) {
                        bPrimeNumber = false;
                        break;
                    }
                }

                if (intNumber % 1 == 0 && intNumber % intNumber == 0 && bPrimeNumber == true) {
                    System.out.printf("Число %d яляется простым\n", intNumber);
                }
                else {
                    System.out.printf("Число %d не яляется простым\n", intNumber);
                }
            }
            else {
                System.out.print("Введеное число меньше 1");
            }

            System.out.print("Enter a number greater than 1 (-1 for quit): ");
            intNumber = sc.nextInt();
            bPrimeNumber = true;
        }
    }
}
