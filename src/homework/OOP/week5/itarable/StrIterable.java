package homework.OOP.week5.itarable;

import java.util.*;

/*
    Iterable - Implementing this interface allows an object to be the target of
    the "for-each loop" statement.
 */

class StrIterable implements Iterable, Iterator {

    private String str;
    private int count = 0;

    StrIterable(String s) {
        str = s;
    }

    // The next three methods impement Iterator.
    public boolean hasNext() {
        if(count < str.length()){
            return true;
        }
        return false;
    }

    public Character next() {
        if(count == str.length())
            throw new NoSuchElementException();

        count++;
        return str.charAt(count-1);
    }

    public void remove () {
        throw new UnsupportedOperationException();
    }

    // This method implements Iterable.
    public Iterator iterator() {
        return this;
    }
}


class ForEachIterable {

    public static void main(String args[]) {
        StrIterable x = new StrIterable("This is a test.");

        // Show each character.
        for(Object ch : x)
            System.out.print(ch);

        System.out.println();
    }
}
