package homework.Intro.week2.codingbat;

/**
 *
 Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

 rotateLeft3([1, 2, 3]) → [2, 3, 1]
 rotateLeft3([5, 11, 9]) → [11, 9, 5]
 rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

public class rotateLeft3_test {
    public static void main(String[] args) {

        //int[] iArrayToRotate = {1, 2, 3};
        //int[] iArrayToRotate = {5, 11, 9};
        int[] iArrayToRotate = {7, 0, 0};

        System.out.print("Given an array -> " );
        Codingbat.printArray(iArrayToRotate);

        int[] iRotatedArray = Codingbat.rotateLeft3(iArrayToRotate);

        System.out.print("\nRotated array -> " );
        Codingbat.printArray(iRotatedArray);
    }
}
