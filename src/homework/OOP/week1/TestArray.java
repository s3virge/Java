package homework.oop.week1;

/**
 * Created by Vit on 27.06.2016.
 */
public class TestArray {
    public static void main(String[] args) {

        int[] iArr = MyArray.createRandomArrFromTo(5000, 1, 1000);
        MyArray.printArray(iArr);

        int[] iNewArr = MyArray.changeArrSize(iArr, 5);
        MyArray.printArray(iNewArr);

        MyArray.sortArr(iArr);
        MyArray.printArray(iArr);
    }
}
