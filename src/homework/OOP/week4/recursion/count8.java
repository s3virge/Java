package homework.OOP.week4.recursion;

/**
 *
 Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
 except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
 Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
 removes the rightmost digit (126 / 10 is 12).

 count8(8) → 1
 count8(818) → 2
 count8(8818) → 4
 */

public class count8 {
    public static void main(String[] args) {

        System.out.printf("count8(818) = %d\n", count8(818));
        System.out.printf("count8(8818) = %d\n",   count8(8818));
        System.out.printf("count8(23884) = %d\n", count8(23884));
        System.out.printf("count8(88788) = %d\n", count8(88788));
        System.out.printf("count8(1234567890) = %d\n", count8(1234567890));
        System.out.printf("count8(9888000) = %d\n", count8(9888000));
    }

    public static int count8(int n) {

        if ( n < 10 )
        {
            if (n == 8)
            {
                return 1;
            }

            return 0;
        }

        int lastDigit = n % 10;
        int withoutLastDigit = n / 10;

        int num = 0;

        if (lastDigit == 8){

            num = 1;

            if (withoutLastDigit % 10 == 8){
                num = 2;
            }
        }

        return num + count8(withoutLastDigit);
    }
}
