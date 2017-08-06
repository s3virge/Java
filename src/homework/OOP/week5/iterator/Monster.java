package homework.OOP.week5.iterator;

import java.util.Iterator;

public class Monster {

    public interface Part { }

    public static class Head implements Part { }
    public static class Hand implements Part { }
    public static class Leg implements Part { }

    private Head head = new Head();
    private Hand theOnlyHand = new Hand();
    private Leg theOnlyLeg = new Leg();

    public Head getHead() { return head; }
    public void setHead(Head rightHead) { this.head = rightHead; }
    public boolean hasHead() { return head != null; }

    public Hand getTheOnlyHand() { return theOnlyHand; }
    public void setTheOnlyHand(Hand theOnlyHand) { this.theOnlyHand = theOnlyHand; }
    public boolean hasHand() { return theOnlyHand != null; }

    public Leg getTheOnlyLeg() { return theOnlyLeg; }
    public void setTheOnlyLeg(Leg theOnlyLeg) { this.theOnlyLeg = theOnlyLeg; }
    public boolean hasLeg() { return theOnlyLeg != null; }

    public static void main(String[] args) {
        // создадим монстра
        Monster monster = new Monster();
        // отрубим ему голову
        monster.setHead(null);
        // создадим итератор
        Iterator iterator = new MonsterIterator(monster);
        // есть ли у него еще части?
        System.out.println("iterator.hasNext() = " + iterator.hasNext()); // true
        // какая следующая часть
        System.out.println("iterator.next() = " + iterator.next()); // Hand
        // а еще есть?
        System.out.println("iterator.hasNext() = " + iterator.hasNext()); // true
        // какая следующая часть
        System.out.println("iterator.next() = " + iterator.next()); // Leg
        // а если отрубить
        System.out.println("iterator.remove();");
        iterator.remove();
        // а еще есть?
        System.out.println("iterator.hasNext() = " + iterator.hasNext()); // false
        // а что с ногой-то?
        System.out.println("monster.getTheOnlyLeg() = " + monster.getTheOnlyLeg()); // null
    }
}