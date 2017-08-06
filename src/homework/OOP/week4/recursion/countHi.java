package homework.OOP.week4.recursion;

/**
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

 countHi("xxhixx") → 1
 countHi("xhixhix") → 2
 countHi("hi") → 1
 countHi("ihihihihih") → 4
 countHi("hiAAhi12hi") → 3
 */

public class countHi {
    public static void main(String[] args) {

        System.out.printf("countHi(\"xxhixx\") → %d\n", countHi("xxhixx"));
        System.out.printf("countHi(\"xhixhix\") → %d\n", countHi("xhixhix"));
        System.out.printf("countHi(\"hi\") → %d\n", countHi("hi"));
        System.out.printf("countHi(\"ihihihihih\") → %d\n", countHi("ihihihihih"));
        System.out.printf("countHi(\"hiAAhi12hi\") → %d\n", countHi("hiAAhi12hi"));
    }

    public static int countHi(String str) {

        String search = "hi";

        if (!str.contains(search)){
            return 0;
        }

        int fromIndex = 0;

        if (str.contains(search)) {

            fromIndex = str.indexOf(search, fromIndex);
            return 1 + countHi(str.substring(fromIndex + search.length(), str.length()));
        }

        return 0;
    }
}
