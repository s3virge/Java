package homework.OOP.week3.sorting;

/**
 * Created by Vit on 12.07.2016.
 */
public class ArraySort {

    public static int[] bubble(int[] arr){

        boolean swapped = false;
        int temp = 0;
        int indexOfLastUnsortedElement = arr.length - 1;

        do {
            swapped = false;

            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (arr[i] > arr[i + 1]){

                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    swapped = true;
                }
            }

            indexOfLastUnsortedElement--;
        }
        while(swapped);

        return arr;
    }

    public static int[] select(int[] arr) {

        int indexCurrentMinimum = 0;
        int buff = 0;

        //повторяем пока не проверили все элементы массива
        for (int i = 0; i < arr.length; i++) {

            //пусть первый не сортированный элемент будет минимальным
            indexCurrentMinimum = i;

            //находим индекс минимального значения в массиве
            for (int j = indexCurrentMinimum + 1; j < arr.length; j++) {
                if (arr[indexCurrentMinimum] > arr[j]){
                    indexCurrentMinimum = j;
                }
            }

            //меняем значение проверяемой ячейки с минимальной
            buff = arr[i];
            arr[i] = arr[indexCurrentMinimum];
            arr[indexCurrentMinimum] = buff;
        }

        return arr;
    }

    public static int[] insert(int[] arr) {

        int tmp = 0;

        for(int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}
