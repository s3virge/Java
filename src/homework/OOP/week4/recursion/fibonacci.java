package homework.OOP.week4.recursion;

/**
 * Created by Vit on 19.07.2016.
 */
public class fibonacci {

    public static void main(String[] args) {

        System.out.printf("Fobonacci(7) = %d\n", fibonacci(7));
        System.out.printf("Fobonacci(8) = %d\n", fibonacci(8));
        System.out.printf("Fobonacci(9) = %d\n", fibonacci(9));
        System.out.printf("Fobonacci(10) = %d\n", fibonacci(10));
        System.out.printf("Fobonacci(11) = %d\n", fibonacci(11));
    }

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
