package homework.OOP.week6.Serializable;

import java.io.*;

/**
 * Created by Vit on 16.08.2016.
 */
public class SerializationDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        final String FILENAME = "serial.txt";

        try (ObjectOutputStream objectOstr = new ObjectOutputStream(new FileOutputStream(FILENAME))) {

            MyClass object1 = new MyClass("qwert", 12, 2.7e10);
            System.out.println("object1 = " + object1);

            objectOstr.writeObject(object1);

        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение при сериализации " + e);
        }

        try (ObjectInputStream objectIsrm = new ObjectInputStream(new FileInputStream(FILENAME))) {

            MyClass object2 = (MyClass) objectIsrm.readObject();
            System.out.println("object2 = " + object2);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Исключение при дисереализации " + e);

            System.exit(0);
        }
    }
}

class MyClass implements Serializable{
    public String s;
    public int i;
    public double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s = " + s + "; i = " + i + "; d = " + d + ";";
    }
}