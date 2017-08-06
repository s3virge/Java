package homework.Intro.week1; /**
 * 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */

import java.util.Scanner;

public class HomeWork_4_2 {
    public static void main(String[] args) {

        //просим пользователя ввести три числа.
        Scanner sc = new Scanner(System.in); //System.in - console
        //выводим приглашение для пользвателя
        System.out.println("Введите первое число: ");
        int first = sc.nextInt(); // получили первое число из консоли

        System.out.println("Введите второе число: ");
        int second = sc.nextInt(); // получили второе число из консоли

        System.out.println("Введите третее число: ");
        int third = sc.nextInt(); //получили третее чилос

        System.out.println("Были введены: " + first + " " + second + " " + third);

        //найдем наибольшее число
        //допустим первое число наибольшее
        int greatest = first;

        //сравниваем его со вторым числом
        if (greatest < second) {
            greatest = second;
        }

        //сравниваем его с третим числом
        if (greatest < third) {
            greatest = third;
        }

        //найдем наименьшее число
        //допустим первое число наименьшее
        int least = first;

        if (least > second) {
            least = second;
        }

        if (least > third) {
            least = third;
        }

        System.out.println("Наибольшее число из введенных: " + greatest);
        System.out.println("Наименьшее число из введенных: " + least);
    }
}