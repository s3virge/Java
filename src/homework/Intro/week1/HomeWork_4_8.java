package homework.Intro.week1; /**
 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */
import java.util.Scanner;

public class HomeWork_4_8 {
    public static void main(String[] args) {

        System.out.println("Программа сравнивает последние цифры во введенных числах. \nВведите первое целое число: ");

        Scanner sc = new Scanner(System.in);
        int iFirstInt = sc.nextInt();

        System.out.println("Введите второе целое число: ");
        int iSecondInt = sc.nextInt();

        int iFirstTheLastDigit = iFirstInt % 10; //получаем последнюю цифру в первом числе
        int iSecondTheLastDigit = iSecondInt % 10; //получаем последнюю цифру во втором числе

        boolean bTheSame = false; //пусть последние цифры разные

        if (iFirstTheLastDigit == iSecondTheLastDigit) {
            bTheSame = true;
        }

        System.out.printf("%d %d - %b", iFirstInt, iSecondInt, bTheSame );
    }
}
