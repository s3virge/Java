package homework.OOP.week5.itarable;

import java.util.NoSuchElementException;
import java.util.Iterator;


/*
    Iterable - Implementing this interface allows an object to be the target of
    the "for-each loop" statement.
 */

public class Range implements Iterable<Integer> {

    private int start, end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    // Inner class example
    private class RangeIterator implements Iterator<Integer> {
        private int cursor;

        public RangeIterator() {
            this.cursor = Range.this.start;
        }

        public boolean hasNext() {
            return this.cursor < Range.this.end;
        }

        public Integer next() {
            if(this.hasNext()) {
                int current = this.cursor;
                this.cursor ++;
                return current;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


    public static void main(String[] args) {

        Range range = new Range(1, 10);

        // Long way
        Iterator<Integer> it = range.iterator();
        while(it.hasNext()) {
            int cur = it.next();
            System.out.println(cur);
        }

        // Shorter, nicer way:
        // Read ":" as "in"
        for(Integer cur : range) {
            System.out.println(cur);
        }
    }
}