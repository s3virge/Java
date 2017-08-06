package DesignPatterns.Factory;

/**
 * Created by s3virge on 18.07.17.
 */
public class Notebook implements Computer {
    @Override
    public void print() {
        System.out.println("Insede Notebook::print method.");
    }
}
