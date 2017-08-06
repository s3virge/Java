package homework.OOP.week4.recursion;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
 * so powerN(3, 2) is 9 (3 squared).

 powerN(3, 1) → 3
 powerN(3, 2) → 9
 powerN(3, 3) → 27
 */

public class powerN {
    public static void main(String[] args) {

        System.out.printf("powerN(3, 1) → %d\n", powerN(3, 1));
        System.out.printf("powerN(3, 2) → %d\n", powerN(3, 2));
        System.out.printf("powerN(3, 3) → %d\n", powerN(3, 3));
        System.out.printf("powerN(10, 3) → %d\n", powerN(10, 3));
    }

    public static int powerN(int base, int n){

        if (n == 1){
            return base;
        }

        return base * powerN(base, n - 1);
    }
}
