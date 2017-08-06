package homework.Intro.week1; /**
 * 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 * Если второе больше, то выводим сумму.
 */

import java.util.Scanner;

public class HomeWork_4_5
{
    public static void main(String[] args)
    {
        System.out.println("Введите первое число: ");

        Scanner sc = new Scanner(System.in);
        int firstValue = sc.nextInt();

        System.out.println("Введите второе число: ");
        int secondValue = sc.nextInt();

        if (firstValue > secondValue)
        {
            int result = firstValue - secondValue;

            System.out.println("Первое число больше второго. " +
                    "\nРазница веденных числ равна " + result);
        }
        else
        {
            System.out.println("Первое число меньше второго или введенные числа равны.");
        }
    }
}