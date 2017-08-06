package homework.Intro.week1; /**
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */

import java.util.Scanner;

public class HomeWork_4_3 {
    public static void main(String[] args) {

        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt(); // получить int c консоли

        if (var % 7 == 0) {
            int doubling = var * var;

            System.out.println("Число " + var + " делится без остатка на 7." +
                    "\nЕго удвоенное значение равно " + doubling);
        }
        else {
            System.out.println("Число " + var + " не делится без остатка на 7." );
        }
    }
}