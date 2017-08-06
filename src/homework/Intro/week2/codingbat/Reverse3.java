package homework.Intro.week2.codingbat;

/**
 *
 Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

 reverse3([1, 2, 3]) → [3, 2, 1]
 reverse3([5, 11, 9]) → [9, 11, 5]
 reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class Reverse3 {
    public static void main(String[] args) {

        //int [] iArr = {1, 2, 3};
        int [] iArr = {5, 11, 9};
        //int [] iArr = {7, 0, 0};

        //показываем какой у нас был массив
        System.out.print("Mассив содержит {" );
        for(int c = 0; c <= 2; c++)
        {
            System.out.printf(" %d", iArr[c]);
        }
        System.out.println(" }" );

        //Что бы инвертировать массив из трех элементов нужно поменять местами первы с последним.
        int iBuff = iArr[0];
        iArr[0] = iArr[2];
        iArr[2] = iBuff;

        System.out.print("Реверсированный массив {" );
        for(int d = 0; d <= 2; d++)
        {
            System.out.printf(" %d", iArr[d]);
        }
        System.out.println(" }" );
    }
}
