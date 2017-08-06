package homework.Intro.week2;

import java.util.Scanner;

/**
 * 4) Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class HomeWork_4_4 {
    public static void main(String[] args) {

        int[] iArray = ArrayHelper.generateArrayInt(56);

        System.out.println("Have array");
        ArrayHelper.printArr(iArray);

        //get the number
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int iNumber = sc.nextInt();

        //Determine how many times the number found in the array
        int iCount = 0;
        for (int i = 0; i < iArray.length ; i++) {
            if (iArray[i] == iNumber) {
                //increase the counter
                iCount++;
            }
        }

        System.out.printf("\nThe number %d occurs %d times in this array", iNumber, iCount);
    }
}
