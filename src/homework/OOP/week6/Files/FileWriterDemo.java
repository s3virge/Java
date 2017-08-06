package homework.OOP.week6.Files;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Vit on 16.08.2016.
 */
public class FileWriterDemo {
    public static void main(String[] args) {

        String source = "Этот новый, относительно кунгур-\n" +
                "ского, узел, является одним из \n" +
                "вариантов его выполнения. Аме-\n" +
                "риканец Фил Д. Смит изобрел его \n" +
                "в период Второй мировой войны \n" +
                "и назвал «верхолазный узел». \n" +
                "Однако английский врач Эдвард \n" +
                "Хантер вновь открыл его в 1978 г., \n" +
                "и полученная в связи с этим широ-\n" +
                "кая огласка привела к учреждению \n" +
                "в 1982 г. Международной органи-\n" +
                "зации любителей вязки узлов. \n" +
                "В данной книге показан охотни-\n" +
                "чий узел доктора Хантера.";

        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("file0.txt");
             FileWriter f1 = new FileWriter("file1.txt");
             FileWriter f2 = new FileWriter("file2.txt");) {

            //вывести данные в первый файл
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }

            //вывести данные в другой файл
            f1.write(buffer);

            //вывесли данные в третий файл
            f2.write(source, source.length()-source.length()/4, source.length()/4);
        }
        catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        }
    }
}
