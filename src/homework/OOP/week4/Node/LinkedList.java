package homework.OOP.week4.node;

/**
 * Created by Vitaliy Kobzar on 25.07.2016.
 */

public class LinkedList {

    private ListElement head;       //first element
    private ListElement tail;       // last element

    public ListElement addToHead(int data) {

        ListElement newElement = new ListElement();
        newElement.value = data;

        //if list without of elements
        if (head == null) {
            head = newElement; //now we have one element
            tail = newElement;
        }
        else {
            newElement.nextElement = head;
            head = newElement;
        }

        return newElement;
    }


    public void addToTail(int data) {

        ListElement newElement = new ListElement();
        newElement.value = data;

        if (tail == null) {
            head = newElement;
            tail = newElement;
        }
        else {
            tail.nextElement = newElement;
            tail = newElement;
        }
    }

    public void print() {

        ListElement element = this.head;

        while (element != null)
        {
            System.out.print(element.value + " ");
            element = element.nextElement;
        }
    }

    public String toString() {

        if (this.head == null) {
            return "null";
        }

        ListElement elem = this.head;
        String str = "";

        while (elem != null) {
            str += elem.value + " ";
            elem = elem.nextElement;
        }

        return str;
    }

    public ListElement[] toArray() {

        ListElement elem = this.head;

        if ( elem == null ) {
            return null;
        }

        //need to know the count of elements
        int countOfElem = 0;

        while (elem != null) {
            countOfElem++;
            elem = elem.nextElement;
        }

        ListElement[] arrOfElem = new ListElement[countOfElem];

        elem = this.head;

        for (int i = 0; i < countOfElem; i++) {
            arrOfElem[i] = elem;
            elem = elem.nextElement;
        }

        return arrOfElem;
    }

    public ListElement insertByIndex(int index, int data) {

        int countOfElem = count();

        //the index can not be less than zero and greater than the index of the last element
        if (index < 0 || index > countOfElem - 1) {
            return null;
        }

        ListElement elem = this.head;

        //move to index
        for (int i = 1; i < index; i++) {
            elem = elem.nextElement;
        }

        //create new element
        ListElement newElem = new ListElement();
        newElem.value = data; //save data

        if (index == 0) {
            newElem.nextElement = elem;
            this.head = newElem;
            return this.head;
        }

        if (elem == this.tail) {
            elem.nextElement = newElem;
            newElem.nextElement = null;
            this.tail = newElem;
            return this.tail;
        }

        newElem.nextElement = elem.nextElement;
        elem.nextElement = newElem;

        return elem.nextElement;
    }

    public int count() {
        int countOfElem = 0;

        ListElement el = this.head;

        while (el != null) {
            countOfElem++;
            el = el.nextElement;
        }

        return countOfElem;
    }

    public ListElement remove(int index) {

        int countOfElem = count();

        if (index < 0 || index > countOfElem - 1 ) {
            return null;
        }

        ListElement elem = this.head;

        if (index == 0) {
            this.head = elem.nextElement;
            return this.head;
        }

        if (index == countOfElem - 1) {
            for (int i = 1; i < index; i++) {
                elem = elem.nextElement;
            }
            elem.nextElement = null;
            this.tail = elem;
            return this.tail;
        }

        ListElement before = this.head;
        for (int i = 1; i < index; i++) {
            before = before.nextElement;
        }

       elem = this.head;
        for (int i = 1; i < index + 1 ; i++) {
            elem = elem.nextElement;
        }

        before.nextElement = elem.nextElement;

        return before;
    }

    // use equals method
    public int indexOf(Object target) {

        ListElement el = this.head;
        int index = 0;

        while (el.nextElement != null) {

            if (target.equals(el)) {
                return index;
            }

            el = el.nextElement;
            index++;
        }

        return -1;
    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *
    public boolean reverse() {

        //move penultimate element
        int indexToMove = count() - 1 - 1;

        if (indexToMove <= 0) {
            return false;
        }

        while (indexToMove >= 0) {
            ListElement el = getElementByIndex(indexToMove);
            addToTail(el.value);
            remove(indexToMove);
            indexToMove--;
        }

        return true;
    }

    public ListElement getElementByIndex(int index) {

        if (index < 0 || index > count()-1) {
            return null;
        }

        ListElement el = this.head;

        for (int i = 1; i <= index; i++) {
            el = el.nextElement;
        }

        return el;
    }

    public ListElement getHeadElement() {
        return this.head;
    }

    public ListElement getTailElement() {
        return this.tail;
    }
}
