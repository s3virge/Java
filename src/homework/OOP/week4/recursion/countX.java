package homework.OOP.week4.recursion;

/**
 *
 Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

 countX("xxhixx") → 4
 countX("xhixhix") → 3
 countX("hi") → 0
 */

public class countX {
    public static void main(String[] args) {

        System.out.printf("countX(\"xxhixx\") → %d\n", countX("xxhixx"));
        System.out.printf("countX(\"xhixhix\") → %d\n", countX("xhixhix"));
        System.out.printf("countX(\"hi\") → %d\n", countX("hi"));

    }

    public static int countX(String str){

        if (!str.contains("x")){
            return 0;
        }

        int index = str.length() - 1;

        if (str.charAt(index) == 'x') {
            return 1 + countX(str.substring(0, index));
        }

        return countX(str.substring(0, index));
    }
}
