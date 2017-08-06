package homework.OOP.week4.recursion;

/**
 *
 We have triangle made of blocks. The topmost row has 1 block, the nextElement row down has 2 blocks,
 the nextElement row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
 the total number of blocks in such a triangle with the given number of rows.

 triangle(0) → 0
 triangle(1) → 1
 triangle(2) → 3
 */

public class triangle {
    public static void main(String[] args) {

        System.out.printf("triangle(0) = %d\n", triangle(0));
        System.out.printf("triangle(1) = %d\n", triangle(1));
        System.out.printf("triangle(2) = %d\n", triangle(2));
        System.out.printf("triangle(3) = %d\n", triangle(3));
        System.out.printf("triangle(4) = %d\n", triangle(4));
    }

    public static int triangle(int rows) {

        if (rows == 0) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }
}
