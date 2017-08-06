package homework.Intro.week1;
/**
 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */

import java.util.Scanner;

public class HomeWork_4_1
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        //получаем от пользователя значение текущего часа
        System.out.println("Введите текущий час от 0 до 24. (Для выхода -1)");

        int res = sc.nextInt();
        String message;

        while ( res != -1) //пока не будет введен -1
        {
            if (res >= 9 && res <= 18)
            {
                message = "Я на работе";
            }
            else
            {
                message = "Я отдыхаю";
            }

            System.out.println(message);

            //получаем от пользователя значение текущего часа
            System.out.println("\nВведите текущий час от 0 до 24. (Для выхода -1)");
            res = sc.nextInt();
        }
    }
}