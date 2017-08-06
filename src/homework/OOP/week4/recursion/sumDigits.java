package homework.OOP.week4.recursion;

/**
 * Given a non-negative int n, return the sum of its digits recursively (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
 * by 10 removes the rightmost digit (126 / 10 is 12).

 sumDigits(126) → 9
 sumDigits(49) → 13
 sumDigits(12) → 3
 */

public class sumDigits {
    public static void main(String[] args) {

        System.out.printf("sumDigits(126) = %d\n", sumDigits(126));
        System.out.printf("sumDigits(49) = %d\n", sumDigits(49));
        System.out.printf("sumDigits(12) = %d\n", sumDigits(12));
        System.out.printf("sumDigits(999999999) = %d\n", sumDigits(999999999));
        System.out.printf("sumDigits(123456789) = %d\n", sumDigits(123456789));
    }

    public static int sumDigits(int n) {

        if (n < 10){
            return n;
        }

        int lastDigit = n % 10;
        int withoutLastDigit = n / 10;

        return lastDigit + sumDigits(withoutLastDigit);
    }
}
