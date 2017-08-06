package homework.OOP.week5.deque;

import java.util.ArrayDeque;

public class MyDeque {
    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Германия");
        states.add("Франция");
        // добавляем элемент в самое начало
        states.push("Великобритания");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }

        System.out.printf("Размер очереди: %d \n", states.size());

        ArrayDeque<Person> people = new ArrayDeque<Person>();

        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}

class Person{

    private String name;

    public Person(String value){
        name = value;
    }

    String getName(){return name;}
}
