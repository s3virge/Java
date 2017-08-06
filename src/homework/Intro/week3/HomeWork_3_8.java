package homework.Intro.week3;

import java.util.Scanner;

/**
 * 3.8. Верхний регистр.

 Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль

 Вход:
 иван васильевич

 Выход:
 Иван Васильевич
 */
public class HomeWork_3_8 {
    public static void main(String[] args) {

        String str = "Enter a few words separated by spaces: ";
        System.out.print(str);

        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        String[] splitStrArr = str.split(" ");

        for (int i = 0; i < splitStrArr.length; i++) {
            String sFirstCh = splitStrArr[i].substring(0, 1);
            sFirstCh = sFirstCh.toUpperCase();

            splitStrArr[i] = sFirstCh + splitStrArr[i].substring(1);
        }

        str = "";
        for(String s : splitStrArr) {
            str += s + " ";
        }

        System.out.print(str);
    }
}
