package homework.Intro.week3;

import java.util.Scanner;

/**
 * 3.7. Найти самое длинное слово в строке(разделенное одним пробелом)
 */
public class HomeWork_3_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //String str = "    qwertyuio asdfg asdfasdf ffffff   ";
        String str = "Enter a few words separated by spaces: ";

        System.out.print(str);
        str = in.nextLine();

        str = str.trim();

        //to find out how many spaces per line
        int iNumOfSpaces = 0;
        int iSpaceIndex = str.indexOf(" ");

        if(iSpaceIndex != -1) { //if there is at least one space
            for (int i = 0; i < str.length(); i++) {

                if(iSpaceIndex == -1) { //if there are no more gaps
                    break;
                }
                else if (iSpaceIndex + 1 <= str.length() - 1) { //if did not come out beyond the array
                    iSpaceIndex = str.indexOf(" ", iSpaceIndex + 1);
                    iNumOfSpaces++; //increasing gaps counter
                }
            }
        }

        //iNumOfSpaces found gaps , then words in iNumOfSpaces line + 1
        String[] strArr = new String[iNumOfSpaces + 1];

        //We need to break the string into an array of strings
        iSpaceIndex = str.indexOf(" ");
        int iStartOfWord = 0;

        for (int i = 0; i < strArr.length; i++) {

            if(iSpaceIndex == -1) { //gaps in the line is no longer
                iSpaceIndex = str.length();
            }

            strArr[i] = str.substring(iStartOfWord, iSpaceIndex);

            //looking for the nextElement gap
            iStartOfWord = iSpaceIndex + 1;
            iSpaceIndex = str.indexOf(" ", iStartOfWord);
        }

        //determine which word longest
        int iMaxLength = 0, intMaxLengthIndex = 0;

        for (int i = 0; i < strArr.length; i++) {
            if(iMaxLength < strArr[i].length()) {
                iMaxLength = strArr[i].length();
                intMaxLengthIndex = i;
            }
        }

        System.out.printf("The longest word in the string -> %s", strArr[intMaxLengthIndex]);
    }
}
