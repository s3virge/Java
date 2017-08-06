package homework.OOP.week4.node;

/**
 * Created by Vitaliy Kobzar on 25.07.2016.
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addToHead(1);
        linkedList.addToHead(2);
        linkedList.addToHead(3);

        linkedList.print();

        linkedList.addToTail(4);

        System.out.println();
        linkedList.print();

        System.out.println();
        System.out.println("LinkedList.toString() -> " + linkedList.toString());

        ListElement[] arr = linkedList.toArray();

        if (arr != null) {
            System.out.print("linkedList.toArray() -> ");

            for (ListElement e : arr) {
                System.out.print(e.value + " ");
            }
        }

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println();
        System.out.printf("linkedList.insertByIndex(2, 10) = %b", (linkedList.insertByIndex(2, 10) != null) ? true : false);
        System.out.println();
        System.out.printf("linkedList.insertByIndex(0, 10) = %b", (linkedList.insertByIndex(0, 10) != null) ? true : false);

        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println();
        System.out.printf("Count of elements = %d", linkedList.count());
        System.out.println();
        System.out.printf("linkedList.insertByIndex(6, 10) = %b", (linkedList.insertByIndex(6, 10) != null) ? true : false);

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println();
        System.out.printf("linkedList.insertByIndex(5, 10) = %b", (linkedList.insertByIndex(5, 10) != null) ? true : false);

        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);
        System.out.println();
        System.out.println("=============================================================");
        linkedList.print();
        System.out.printf("\nlinkedList.remove(0) = %b", (linkedList.remove(0) != null) ? true : false);
        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println("\n=============================================================");
        linkedList.print();
        System.out.printf("\nlinkedList.remove(5) = %b", (linkedList.remove(5) != null) ? true : false);
        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println("\n=============================================================");
        linkedList.print();
        System.out.printf("\nlinkedList.remove(3) = %b", (linkedList.remove(3) != null) ? true : false);
        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println("\n=============================================================");
        linkedList.print();
        System.out.printf("\nlinkedList.remove(2) = %b", (linkedList.remove(2) != null) ? true : false);
        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        System.out.println("\n=============================================================");
        linkedList.print();
        System.out.printf("\nlinkedList.remove(3) = %b", (linkedList.remove(3) != null) ? true : false);
        System.out.println();
        linkedList.print();

        System.out.printf("\nHead elements = %d", linkedList.getHeadElement().value);
        System.out.printf("\nTail elements = %d", linkedList.getTailElement().value);

        //==========================================================
        for (int i = 0; i < 7; i++) {
            linkedList.insertByIndex(i, i);
        }

        System.out.println();
        linkedList.print();

        ListElement lElem = linkedList.insertByIndex(5, 555);

        System.out.println();
        linkedList.print();

        int index = linkedList.indexOf(lElem);

        if (index > 0) {
            System.out.println();
            System.out.printf("Index of 555 is -> %d", index);
        }

        System.out.println("\n======================================================");
        if (linkedList.reverse()) {
            System.out.print("linkedList.reverse() -> ");
            linkedList.print();
        }
    }
}
