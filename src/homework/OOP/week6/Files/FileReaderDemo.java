package homework.OOP.week6.Files;

import java.io.*;

/**
 * Created by Vit on 16.08.2016.
 */
public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader file = new FileReader("d:\\Radio.m3u")) {

            int c = 0;

            while ( c != -1) {
                c = file.read();
                System.out.print((char)c);
            }
        }
        catch (IOException e) {
            System.out.println(" Ошибка ввода-вывода: " + e);
        }
    }
}
