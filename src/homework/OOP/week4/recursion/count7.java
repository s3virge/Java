package homework.OOP.week4.recursion;

/**
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

 count7(717) → 2
 count7(7) → 1
 count7(123) → 0
 */

public class count7 {
    public static void main(String[] args) {

        System.out.printf("count7(717) = %d\n", count7(717));
        System.out.printf("count7(7) = %d\n",   count7(7));
        System.out.printf("count7(123) = %d\n", count7(123));
        System.out.printf("count7(774477) = %d\n", count7(774477));
        System.out.printf("count7(1234567890) = %d\n", count7(1234567890));
        System.out.printf("count7(9223372036854775807) = %d\n", count7(9223372036854775807L));
    }

    public static long  count7(long n) {

        if (n < 10){

            if (n == 7){
                return 1;
            }

            return 0;
        }

        long lastDigit = n % 10;
        long withoutLastDigit = n / 10;

        if ( lastDigit == 7 ) {
            return count7(withoutLastDigit) + 1;
        }

        return count7(withoutLastDigit);
    }
}
