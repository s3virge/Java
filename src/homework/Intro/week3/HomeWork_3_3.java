package homework.Intro.week3;
import java.util.Scanner;

/**
 * 3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class HomeWork_3_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = in.nextLine();

        if(isPalindrome(str)) {
            System.out.printf("\'%s\' is palindrome", str);
        }
        else {
            System.out.printf("\'%s\' is not palindrome", str);
        }
    }

    public static boolean isPalindrome(String str) {

        boolean bResult = false;

        //remove spaces
        String verifiableString = str;
        if(str.contains(" ")) {
            verifiableString = str.replace(" ", "");
        }

        int strHalf = verifiableString.length()/2;
        int strLength = verifiableString.length();

        //divide string to half
        String sFirstHalf = verifiableString.substring(0, strHalf);
        String sSecondHalf = verifiableString.substring(strHalf, strLength); ;

        if(strLength % 2 != 0 ) { //if length of string is odd
            sSecondHalf = verifiableString.substring(strHalf + 1, strLength);
        }

        //reverse string
        sSecondHalf = reverseString(sSecondHalf);

        //compare two half of string
        int iCompRes = sFirstHalf.compareToIgnoreCase(sSecondHalf);

        //if they equal, then string is palindrome
        if(iCompRes == 0) {
            bResult = true;
        }

        //else not
        return bResult;
    }

    public static String reverseString(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }
}
