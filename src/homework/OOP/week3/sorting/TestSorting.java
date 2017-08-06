package homework.OOP.week3.sorting;

import homework.Intro.week2.ArrayHelper;

/**
  2. Write own sorting algorithms
     bubble, selection, insertion
     http://visualgo.net/sorting.html
     compare each algorithm by work time
 */
public class TestSorting {
    public static void main(String[] args) {

        final int SIZE = 100;

        System.out.println("---  Bubble sort ---");
        int[] arr = ArrayHelper.generateArrFromTo(SIZE, 0, SIZE);
        ArrayHelper.printArr(arr);
        long start = System.currentTimeMillis();
        ArrayHelper.printArr(ArraySort.bubble(arr));
        long stop = System.currentTimeMillis();
        System.out.printf("Time sorting an array of elements %d: %d ms\n", SIZE, stop - start);

        System.out.println("---  select sort ---");
        arr = ArrayHelper.generateArrFromTo(SIZE, 0, SIZE);
        //arr = new int[]{10, 9 ,8, 7, 6, 5, 4, 3, 2, 1};
        ArrayHelper.printArr(arr);
        start = System.currentTimeMillis();
        ArrayHelper.printArr(ArraySort.select(arr));
        stop = System.currentTimeMillis();
        System.out.printf("Time sorting an array of elements %d: %d ms\n", SIZE, stop - start);

        System.out.println("---  insert sort ---");
        arr = ArrayHelper.generateArrFromTo(SIZE, 0, SIZE);
        //arr = new int[]{10, 9 ,8, 7, 6, 5, 4, 3, 2, 1};
        ArrayHelper.printArr(arr);
        start = System.currentTimeMillis();
        ArrayHelper.printArr(ArraySort.insert(arr));
        stop = System.currentTimeMillis();
        System.out.printf("Time sorting an array of elements %d: %d ms\n", SIZE, stop - start);
    }
}
