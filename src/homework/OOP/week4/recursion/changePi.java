package homework.OOP.week4.recursion;

/**
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

 changePi("xpix") → "x3.14x"
 changePi("pipi") → "3.143.14"
 changePi("pip") → "3.14p"
 changePi("hip") → "hip"
 */

public class changePi {
    public static void main(String[] args) {

        System.out.printf("changePi(\"xpix\")→ %s\n", changePi("xpit"));
        System.out.printf("changePi(\"pipi\") → %s\n",changePi("pipi"));
        System.out.printf("changePi(\"pip\") → %s\n", changePi("pip") );
        System.out.printf("changePi(\"hip\") → %s\n", changePi("hip") );

    }

    public static String changePi(String str) {

        //если не содержит pi, то возвращае эту строку назад
        if (!str.contains("pi")) {
            return str;
        }


        int index = str.indexOf("pi");

        if (index != 0) {
            return str.substring(0, index) + changePi(str.substring(index, str.length()));
        }

        return "3.14" + changePi(str.substring(index + 2, str.length()));
    }

}
