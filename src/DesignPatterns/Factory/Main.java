package DesignPatterns.Factory;

/**
 * Created by s3virge on 18.07.17.

Factory pattern is a creational pattern as this pattern provides better ways to create an object.

 In Factory pattern, we create object without exposing the creation logic to the client.

 */


public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();

        //get an object of desktop and call its print method.
        computerFactory.getType("Desktop").print();

        Computer comp1 = computerFactory.getType("Notebook");
        comp1.print();

        Computer comp2 = computerFactory.getType("Telephone");
        comp2.print();

        Computer comp3 = computerFactory.getType("Tablet");
    }
}
