package homework.oop.week1;

/**
 * 3. Написать класс дробь
 - сложение дробей
 - вычитание
 - умножение
 - деление
 - приведение к строке
 - вывод
 - метод для сравнения с другой дробью
 */

public class TestMyFraction {
    public static void main(String[] args) {

        MyFraction oFirstFract = new MyFraction(2, 5);
        System.out.printf("\nThe first fraction %s", oFirstFract.getRead());

        MyFraction oSecondFract = new MyFraction(3, 4);
        System.out.printf("\nThe second fraction %s", oSecondFract.getRead());

        MyFraction oThird = new MyFraction(oFirstFract.getChislitel(), oFirstFract.getZnamenatel());
        oThird.add(oSecondFract);
        System.out.printf("\n%s + %s = %s", oFirstFract.getRead(), oSecondFract.getRead(), oThird.getRead());

        oThird.setChislitel(oFirstFract.getChislitel());
        oThird.setZnamenatel(oFirstFract.getZnamenatel());

        oThird.sub(oSecondFract);
        System.out.printf("\n%s - %s = %s", oFirstFract.getRead(), oSecondFract.getRead(), oThird.getRead());

        oThird.setFraction(oFirstFract.getChislitel(), oFirstFract.getZnamenatel());
        oThird.mult(oSecondFract);
        System.out.printf("\n%s * %s = %s", oFirstFract.getRead(), oSecondFract.getRead(), oThird.getRead());

        oFirstFract.setFraction(4, 7);
        oSecondFract.setFraction(2, 5);
        oThird.setFraction(oFirstFract.getChislitel(), oFirstFract.getZnamenatel());

        oThird.div(oSecondFract);
        System.out.printf("\n%s / %s = %s", oFirstFract.getRead(), oSecondFract.getRead(), oThird.getRead());
    }
}
