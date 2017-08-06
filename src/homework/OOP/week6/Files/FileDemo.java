package homework.OOP.week6.Files;

import java.io.File;

/**
 * Created by Vit on 15.08.2016.
 */
public class FileDemo {

    static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f= new File("D:\\Users\\Vit\\Desktop\\Java\\homework1.txt");

        print("File name = " + f.getName());
        print("File path = " + f.getPath());
        print("Absolute path = " + f.getAbsolutePath());
        print(f.canRead() ? "доступен для чтения" : "не доступен для чтения");
        print(f.isDirectory() ? "является директорией" : "не является директорией");
        print("File size = " + f.length() + " byte");
        print(f.isHidden() ? "файл скрыт" : "файл не скрыт");
    }
}
