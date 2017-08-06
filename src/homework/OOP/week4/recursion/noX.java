package homework.OOP.week4.recursion;

/**
 Given a string, compute recursively a new string where all the 'x' chars have been removed.

 noX("xaxb") → "ab"
 noX("abc") → "abc"
 noX("xx") → ""
 noX("axxbxx") → "ab"
 */

public class noX {
    public static void main(String[] args) {

        System.out.printf("noX(\"xaxb\") → %s\n", noX("xaxb"));
        System.out.printf("noX(\"abc\")  → %s\n", noX("abc"));
        System.out.printf("noX(\"xx\")   → %s\n", noX("xx"));
        System.out.printf("noX(\"axxbxx\") → %s\n", noX("axxbxx"));
        System.out.printf("noX(\"Hellox\") → %s\n", noX("Hellox"));
    }

    public static String noX(String str){

        if (!str.contains("x")) {
            return str;
        }

        int index = str.indexOf("x");

        return str.substring(0, index) + noX(str.substring(index + 1, str.length()));
    }
}
