package homework.Intro.week3;

import java.util.Random;
import java.util.Scanner;

/**
 * 3.12*. Строки. Ввод пароля.
 Написать программу ввода пароля пользователя.
 Пользователь вводит пароль 2 раза.
 Пароль должен удовлетворять следующим требованиям:
 - длинна пароля должна быть от 8 до 20 символов
 - в пароле должны быть как маленькие так и большие буквы
 - должны быть цифры
 - не должен содержать слов 'password', 'pass', 'gfhjkm'
 - генерировать случайный пароль используя символы: a-z A-Z 0-9
 */
public class HomeWork_3_12 {
    public static void main(String[] args) {

        String message = "The password must meet the following requirements:\n" +
                " - the length of the password must be between 8 and 20 characters\n" +
                " - the password should be as small and large letters\n" +
                " - must be numbers\n" +
                " - It should not contain the word 'password', 'pass', 'gfhjkm'\n";

        System.out.println(message);

        boolean bPasswordsMatch = false; //passwords match?
        boolean bPassMeetMinimum = false; //password meet the minimum requirements?
        Scanner in = new Scanner(System.in);
        String sPassFirst = "";

        while (!bPasswordsMatch) {

            System.out.print("Enter the password: ");
            sPassFirst = in.next();

            //enter the password until there is an error
            bPassMeetMinimum = false;

            while (!bPassMeetMinimum) {
                //check entered password
                bPassMeetMinimum = checkPassword(sPassFirst);

                if (!bPassMeetMinimum) { //the password does not meet the minimum requirements
                    //enter the password again
                    System.out.print("Enter the password: ");

                    in = new Scanner(System.in);
                    sPassFirst = in.next();
                }
            }

            //enter the password a second time
            System.out.print("Enter password again: ");

            in = new Scanner(System.in);
            String sPassSecond = in.next();

            //the first and second passwords must match
            bPasswordsMatch = true;

            if (sPassFirst.equals(sPassSecond)) {
                System.out.println("The passwords match.\n");
            } else {
                System.out.println("The entered passwords do not match. Try again.");
                bPasswordsMatch = false;
            }
        }

        ///////////////////////////////////////////////////////////////////////
        int passLength = 9;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Automatically generated password of %d characters - %s\n", passLength, genPassword(passLength));
        }
    }

    public static boolean checkPassword(String strPassword) {

        String strError = "Error"; //Error massege

        boolean  bError = true; //no mistakes

        //Password length must be at least 8 and no more than 20
        if (strPassword.length() < 8 || strPassword.length() > 20) {
            strError = "Password length must be at least 8 and no more than 20";
            bError = false;
        }
        else if (!checkBigChar(strPassword) && bError) { //if there are no capital letters
            strError = "The password must be capital letters";
            bError = false;
        }
        else if (!checkSmallChar(strPassword) && bError) { //if there are no letters
            strError = "The password should contain lowercase letters";
            bError = false;
        }
        else if (!checkDigit(strPassword) && bError) { //if there are no numbers
            strError = "The password must have numbers";
            bError = false;
        }
        else if (checkWords(strPassword) && bError) { //if the password contains the words
            strError = "The password must not contain the words 'password', 'pass', 'gfhjkm'";
            bError = false;
        }

        if (!bError) { //if false
            System.out.println(strError );
        }

        return bError;
    }

    public static boolean checkBigChar(String sPass) {

        char chCh = ' ';

        for (int i = 0; i < sPass.length(); i++) {
            chCh = sPass.charAt(i);

            if (Character.isAlphabetic(chCh)) { //if letter
                //is she big
                if (Character.isUpperCase(chCh)) {
                    return true; //she is big
                }
            }
        }

        return false;
    }

    public static boolean checkSmallChar(String sPass) {

        char chCh = ' ';

        for (int i = 0; i < sPass.length(); i++) {
            chCh = sPass.charAt(i);

            if (Character.isAlphabetic(chCh)) { //if letter
                //is she small
                if (Character.isLowerCase(chCh)) {
                    return true; //she is small
                }
            }
        }

        return false;
    }

    public static boolean checkDigit(String sPass) {
        char chCh = ' ';

        for (int i = 0; i < sPass.length(); i++) {
            chCh = sPass.charAt(i);

            if (Character.isDigit(chCh)) {
                    return true; //find digit
            }
        }

        return false;
    }

    public static boolean checkWords(String sPass) {
        String[] words = {"password", "pass", "gfhjkm"};

        for (int i = 0; i < words.length; i++) {
            if (sPass.contains(words[i])) {
                return true;
            }
        }

        return false;
    }

    //generate a random password using the characters: a-z A-Z 0-9
    public static String genPassword(int iLength) {

        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String randomPass = "";
        final Random random = new Random();
        int index = 0;

        for (int i = 0; i < iLength; i++)
        {
            index = random.nextInt(str.length()); //use all characters from str
            randomPass += str.charAt(index);
        }

        return randomPass;
    }
}
