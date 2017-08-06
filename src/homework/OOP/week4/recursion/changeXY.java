package homework.OOP.week4.recursion;

/**
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

 changeXY("codex") → "codey"
 changeXY("xxhixx") → "yyhiyy"
 changeXY("xhixhix") → "yhiyhiy"
 */

public class changeXY {
    public static void main(String[] args) {

        System.out.printf("changeXY(\"xxhixx\") → %s\n", changeXY("xxhixx"));
        System.out.printf("changeXY(\"xhixhix\") → %s\n", changeXY("xhixhix"));
        System.out.printf("changeXY(\"hi\") → %s\n", changeXY("hi"));
        
    }

    public static String changeXY(String str) {

        if (!str.contains("x")) {
            return str;
        }

        int index = str.length() - 1;

        if (str.charAt(index) == 'x') {

            return changeXY(str.substring(0, index)) + "y";
        }

        return changeXY(str.substring(0, index)) + str.charAt(index) ;
    }
}
