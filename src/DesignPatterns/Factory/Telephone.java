package DesignPatterns.Factory;

/**
 * Created by s3virge on 18.07.17.
 */
public class Telephone implements Computer {

    @Override
    public void print() {
        System.out.println("Inside Telephone::print() method.");
    }
}
