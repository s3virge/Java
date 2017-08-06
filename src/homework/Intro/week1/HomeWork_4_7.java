package homework.Intro.week1; /**
4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
 (целую часть от деления  и остачу)
в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */

import java.util.Scanner;

public class HomeWork_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Вводим два числа
        System.out.println("Введие первое число: ");
        int iFirstInt = sc.nextInt();

        System.out.println("Введие второе число: ");
        int iSecondInt = sc.nextInt();

        int iFirstDivisionRemainder = iFirstInt % iSecondInt; //остаток деления первого числа на второе
        int iSecondDivisionRemainder = iSecondInt % iFirstInt; //остаток деления второго числа на первое

        int iFirstIntegerPartOfTheDivision = iFirstInt / iSecondInt; //целая часть от деления первого числа на втрое
        int iSecondIntegerPartOfTheDivision = iSecondInt / iFirstInt; //целая часть от деления второго числа на первое

        //если одно из них делиться на другое без остатка
        if (iFirstDivisionRemainder == 0) {
            //то выводим тру и показываем результат деления
            //(целую часть от деления  и остачу)
            System.out.println("TRUE");
            System.out.printf("Целая часть от деления %d на %d равна %d.", iFirstInt, iSecondInt, iFirstIntegerPartOfTheDivision );
            System.out.printf(" Остаток от деления равен %d.", iFirstDivisionRemainder);
        }
        else if (iSecondDivisionRemainder == 0) {
            System.out.println("TRUE");
            System.out.printf("Целая часть от деления %d на %d равна %d.", iSecondInt, iFirstInt, iSecondIntegerPartOfTheDivision );
            System.out.printf(" Остаток от деления равен %d.", iSecondDivisionRemainder);
        }
        else {
            //в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
            System.out.println("FALSE");

            System.out.printf("Целая часть от деления %d на %d равна %d.", iFirstInt, iSecondInt, iFirstIntegerPartOfTheDivision );
            System.out.printf(" Остаток от деления равен %d.", iFirstDivisionRemainder);

            System.out.printf("\nЦелая часть от деления %d на %d равна %d.", iSecondInt, iFirstInt, iSecondIntegerPartOfTheDivision );
            System.out.printf(" Остаток от деления равен %d.", iSecondDivisionRemainder);
        }
    }
}
