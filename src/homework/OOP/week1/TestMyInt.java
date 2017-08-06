package homework.oop.week1;

/**
 * Created by Vit on 25.06.2016.
 */
public class TestMyInt {
    public static void main(String[] args) {

        MyInt myInt1 = new MyInt(2);
        MyInt myInt2 = new MyInt(25);

        System.out.printf("myInt1 = %d\n", myInt1.getMyInteger());
        System.out.printf("myInt2 = %d\n", myInt2.getMyInteger());

        MyInt myInt3 = myInt1.add(myInt2);
        System.out.printf("after myInt1.add(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt1.sub(myInt2);
        System.out.printf("after myInt1.sub(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt1.mult(myInt2);
        System.out.printf("after myInt1.mult(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt1.div(myInt2);
        System.out.printf("after myInt1.div(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt1.pow(myInt2.getMyInteger());
        System.out.printf("after myInt1.sub(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt2.faktorial();
        System.out.printf("after myInt2.faktorial() myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt1.ostatokDiv(myInt2);
        System.out.printf("after myInt1.ostatokDiv(myInt2) myInt3 = %d\n", myInt3.getMyInteger());

        myInt3 = myInt2.comp(myInt1);
        System.out.printf("after myInt2.comp(myInt1) myInt3 = %d\n", myInt3.getMyInteger());
    }
}
