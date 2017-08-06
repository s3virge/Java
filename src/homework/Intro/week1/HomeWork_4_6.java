package homework.Intro.week1; /**
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */

import java.util.Scanner;

public class HomeWork_4_6 {

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");

        Scanner sc = new Scanner(System.in);
        int firstInt = sc.nextInt();

        System.out.println("Введите второе число: ");
        int secondInt = sc.nextInt();

        //вычисляем сумму
        int sumInt = firstInt + secondInt;

        //если сумма в диапазоне от 11 до 19
        if (sumInt > 11 && sumInt < 19) {
            //то выводим сумму
            System.out.println("Введенные числа находятся в диапазоне меджу 11 и 19" +
                    "\nСумма введенных чисел равна " + sumInt);
        }
        else {
            System.out.println("Введенные числа не находятся в диапазоне между 11 и 19");
        }
    }
}
