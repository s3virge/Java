package homework.Intro.week1; /**
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */

import java.util.Locale;
import java.util.Scanner;

public class HomeWork_4_4
{
    public static void main(String[] args)
    {

        System.out.println("Введите число с плавающей точкой больше 0 и меньше 1: ");

        Scanner sc = new Scanner(System.in);
        //use US locale чтобы использовать точку вместо запятой
        sc.useLocale(Locale.US);

        float value = sc.nextFloat();

        if (value >= 0.0 && value <= 1.0)
        {
            System.out.println("Введенное число " + value + " больше 0 и меньше 1");
        }
        else
            System.out.println("Введенное число " + value);
    }
}