package DesignPatterns.Singleton;

/**
 * Singleton pattern is a creational pattern.

 This pattern involves only a single class which is responsible to creates its own object.

 The class ensures that only single object get created.

 This class provides a way to access its only object.

 For example, when design a user interface, we may only have one main application windows.
 We can use the Singleton Pattern to ensure that there is only one instance of the MainApplicationWindow object.
 */

class MainWindow {
    //create an object of MainWindow
    private static MainWindow instance = new MainWindow();

    //make the constructor private so that this class cannot be
    //instantiated by other class
    private MainWindow(){}

    //Get the only object available
    public static MainWindow getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

public class Main {
    public static void main(String[] args) {
        //Get the only object available
        MainWindow object = MainWindow.getInstance();

        //show the message
        object.showMessage();
    }
}