package homework.oop.week1;

/**
 * 5. Написать класс массив.
 - нахождение минимального
 - нахождение максимального
 - заполнение случайными числами в диапазоне
 - красивый вывод на экран {2 4 5 6}
 -* увеличить размер
 -* сделать сортировку массива
 -* метод для сравнения с другим массивом
 */

public class MyArray {

    //create new array of ints
    public static int[] createArray(int iSizeOfArray) {

        int[] intArray = new int[iSizeOfArray];

        //fill an array with random values
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
            //System.out.println(intArray[i]);
        }

        return intArray;
    }

    public static void printArray(int[] mas) {

        System.out.print("{");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.print("}\n");
    }

    public static int[] createRandomArray(int size) {

        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }

        return mas;
    }


    public static int findMin(int[] mas) {

        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }

        return min;
    }

    //find max value
    public static int findMax(int[] iMas) {

        int max = iMas[0];

        for (int i = 0; i < iMas.length; i++) {
            if (iMas[i] > max) {
                max = iMas[i];
            }
        }

        return max;
    }

    //генерирует случайных значиний типа int в указанном диапазоне
    public static int[] createRandomArrFromTo(int iArrSize, int iGenFrom, int iGenTo) {

        iGenTo++; //increase by 1 that have a specified number of iGenTo was generated inclusive
        int[] iArr = new int[iArrSize];

        for (int i = 0; i < iArr.length; i++) {
            //iGenTo - iGenFrom - specifies the number of digits in the range
            //+ - iGenFrom - bias
            iArr[i] = (int)(iGenFrom + Math.random() * (iGenTo - iGenFrom));

           /*
            System.out.printf("%d,", iArr[i]);
            //System.out.print( (int)(Math.random()*5) ); //0-4 if +3 then from 3-7
            if (iArr[i] == 75) {
                System.out.printf("75 -> %d, ",i);
            }*/
        }

        return iArr;
    }

    public static int[] changeArrSize(int[] iArr, int iSize){

        int[] iNewArr = new int[iSize];

        for (int i = 0; i < iSize; i++) {
            if(iArr.length == i){
                break;
            }

            iNewArr[i] = iArr[i];
        }

        return iNewArr;
    }

    public static int[] sortArr(int[] iArr){

        //Arrays.sort(iArr);

        int iBuff = 0;

        for (int i = 0; i < iArr.length; i++) {
            for (int j = 0; j < iArr.length; j++) {
                if(iArr[i] < iArr[j]){
                    iBuff = iArr[i];
                    iArr[i] = iArr[j];
                    iArr[j] = iBuff;
                }
            }
        }

        return iArr;
    }
}