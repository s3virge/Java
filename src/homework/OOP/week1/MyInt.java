package homework.oop.week1;

/**
 * 2. Написать класс число.
 - сложение
 - вычитание
 - умножение
 - деление
 - возведение в степень
 - вычисление факториала
 - вычисление остатка от деления
 - метод который сравнивает два числа
 */

public class MyInt {

    private long myInteger;

    public MyInt() {
        this.myInteger = 0;
    }

    public MyInt(long myInt) {
        this.myInteger = myInt;
    }

    public long getMyInteger() {
        return myInteger;
    }

    public MyInt add(MyInt myInt){
        return new MyInt(this.myInteger + myInt.getMyInteger());
    }

    //subtraction
    public MyInt sub(MyInt myInt) {
        return new MyInt(this.myInteger - myInt.getMyInteger());
    }

    //multiplication
    public MyInt mult(MyInt myInt) {
        return new MyInt(this.myInteger * myInt.getMyInteger());
    }

    //division
    public MyInt div(MyInt myInt) {
        return new MyInt(this.myInteger / myInt.getMyInteger());
    }

    //degree
    public MyInt pow(final long iPow) {

        long lValue = this.myInteger;

        for (int i = 1; i < iPow; i++) {
            lValue *= this.myInteger;
        }

        return new MyInt(lValue);
    }

    //факториал - произведение всех натуральных чисел от 1 до n включительно:
    public MyInt faktorial() {

        long lValue = 1;

        for (int i = 1; i <= this.myInteger; i++) {
            lValue *= i;
        }

        return new MyInt(lValue);
    }

    //остаток от деления
    public MyInt ostatokDiv(MyInt oInt){
        return new MyInt(this.myInteger % oInt.myInteger);
    }

    //остаток от деления
    public MyInt comp(MyInt oInt){
        int iResult = -1; //-1 this bigger then oInt

        if (this.myInteger == oInt.myInteger) {
            iResult = 0; //одинаковые
        }

        if (this.myInteger < oInt.myInteger) {
            iResult = 1; //oInt is biggest
        }
        return new MyInt(iResult);
    }
}
