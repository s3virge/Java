package homework.Intro.week2;

import java.util.Scanner;

/**
 * Created by Vit on 08.06.2016.
 */
public class ArrayHelper {

    //create new array of ints
    public static int[] generateArrayInt(int iSizeOfArray) {

        int[] intArray = new int[iSizeOfArray];

        //fill an array with random values
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 100);
            //System.out.println(intArray[i]);
        }

        return intArray;
    }

    public static void printArr(int[] mas) {
        System.out.print("[");

        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i]);

            if (i == mas.length - 1) {
                break;
            }

            System.out.print(", ");
        }

        System.out.println("]");
    }

    public static int[] genRanM(int size){
        int[] mas = new int[size];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * 100);
        }
        return mas;
    }
    //98 12 20 10 -5

    //как вернуть из метода два параметра?
    //как передать методу параметр по ссылке?
    public static int findMin(int[] mas){
        int min = mas[0];
        for(int i = 0; i < mas.length; i++){
            if(mas[i] < min){
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

    public static int[] genMasWithCond(int size){
        int[] mas = new int[size];
        for(int i = 0; i < mas.length; i++){
            int ran = (int)(Math.random() * 100);

            mas[i] = i % 2 == 0 ?
                    (ran % 2 == 0 ? ran : ran +1 ) :
                    (ran % 2 == 1 ? ran : ran + 1);

            if(i % 2 == 0){
                if(ran % 2 == 0){
                    mas[i] = ran;
                } else {
                    mas[i] = ran + 1;
                }
            } else {
                if(ran % 2 == 1){
                    mas[i] = ran;
                } else {
                    mas[i] = ran + 1;
                }
            }

        }
        return mas;

    }

    public static int[] inputMas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input array size");
        int size = sc.nextInt();

        int[] mas = new int[size];

        for(int i = 0; i < mas.length; i++){
            System.out.println("input " + (i+1) + " element");
            mas[i] = sc.nextInt();
        }

        return mas;
    }

    //calculate the arithmetic mean of the array
    public static float arithmeticMean(int[] iArrayForCalc) {
        //calculate the sum of elements in array
        float iSum = 0;
        for (int i = 0; i < iArrayForCalc.length ; i++) {
            iSum = iSum + iArrayForCalc[i];
        }

        return iSum / iArrayForCalc.length;
    }

    //calculate the arithmetic mean of the array in selected range
    public static double arithmeticMeanRange(int[] iArrayForCalc, int iStartIndex, int iEndIndex) {
        //calculate the sum of elements in array
        double iSum = 0; int iCount = 0;
        for (int i = iStartIndex; i <= iEndIndex; i++) {
            iSum = iSum + iArrayForCalc[i];
            iCount++;
        }
        return iSum / iCount;
    }

    //генерирует случайных значиний типа int в указанном диапазоне
    public static int[] generateArrFromTo(int iArrSize, int iGenFrom, int iGenTo) {

        iGenTo++; //increase by 1 that have a specified number of iGenTo was generated inclusive
        int[] iArr = new int[iArrSize];

        for (int i = 0; i < iArr.length; i++) {
            //iGenTo - iGenFrom - specifies the number of digits in the range
            //+ - iGenFrom - bias
            //iArr[i] = (int)(Math.random() * (iGenTo - iGenFrom) + iGenFrom);
            iArr[i] = (int)(Math.random() * (iGenTo - iGenFrom) + iGenFrom);

           /*
            System.out.printf("%d,", iArr[i]);
            //System.out.print( (int)(Math.random()*5) ); //0-4 if +3 then from 3-7
            if (iArr[i] == 75) {
                System.out.printf("75 -> %d, ",i);
            }*/
        }

        return iArr;
    }

    //returns the number of even numbers in an array
    public static int calcEvenNum(int[] iArray) {
        int iCounter = 0;

        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] % 2 == 0) {
                iCounter++;
            }
        }

        return iCounter;
    }

    // обрезать массив по границам start и end
    public static int[] splitArray(int[] arr, int startIndex, int endIndex) {

        //check out of range
        if (endIndex > arr.length - 1) {
            endIndex = arr.length - 1;
        }

        if (startIndex < 0) {
            startIndex = 0;
        }

        int[] intArr = new int[endIndex - startIndex + 1]; //+1 for last value inclusive

        int iCount = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            intArr[iCount] = arr[i];
            iCount++;
        }

        return intArr;
    }

    //invert the array
    public static int[] invertArray(int[] iArr) {

        int iCount = iArr.length - 1; //iCount ссылается на последнюю ячейку
        int iBuff = 0;
        //выполняем пока не дошли до середины
        for (int i = 0; i < iArr.length / 2; i++) {
            //меняем местами значения в первой ячейке и в последней
            iBuff = iArr[i]; //сохраняем значение первой яцейки
            iArr[i] = iArr[iCount]; //записываем в перую ячейку значение из последней
            iArr[iCount] = iBuff; //записываем в последнюю ячейку значение из первой
            iCount--; //смещаемся от конца к середине
        }

        return iArr;
    }

    public static int calcCharInString(String sourceString, String chToCalc) {
        int iNumOfCharInString = 0;

        char[] charArray = sourceString.toCharArray();
        char[] ch = chToCalc.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
           if(charArray[i] == ch[0]) {
               iNumOfCharInString++;
           }
        }

        return iNumOfCharInString;
    }

    public static int[] sort(int[] iArr){

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

