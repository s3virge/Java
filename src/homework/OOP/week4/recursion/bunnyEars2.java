package homework.OOP.week4.recursion;

/**
 *
 We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
 The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

 bunnyEars2(0) → 0
 bunnyEars2(1) → 2
 bunnyEars2(2) → 5
 */

public class bunnyEars2 {
    public static void main(String[] args) {

        System.out.printf("bunnyEars2(0) = %d\n",bunnyEars2(0));
        System.out.printf("bunnyEars2(1) = %d\n",bunnyEars2(1));
        System.out.printf("bunnyEars2(2) = %d\n",bunnyEars2(2));
        System.out.printf("bunnyEars2(3) = %d\n",bunnyEars2(3));
        System.out.printf("bunnyEars2(4) = %d\n",bunnyEars2(4));
    }

    public static int bunnyEars2(int num) {

        if ( num == 0 ) {
            return 0;
        }

        if ( num % 2 == 0 ) {
            return 3 + bunnyEars2(num - 1);
        }

        return 2 + bunnyEars2(num - 1);
    }
}
