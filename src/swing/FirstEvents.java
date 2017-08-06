package swing;

import javax.swing.*;
import java.awt.event.*;
/**
 * Created by Vit on 07.10.2016.
 */
public class FirstEvents extends JFrame{
    FirstEvents(){
        super("FirstEvent");
        //при закрытии окна - выход
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //регистрируем нашего слушателя
        addKeyListener(new KeyLis());
        //выводим окно на экран
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstEvents();
    }

    class KeyLis implements KeyListener{
        //печать символа
        public void keyTyped(KeyEvent e) {
            System.out.println(e);
        }

        //нажатие клавиши
        public void keyPressed(KeyEvent e) {
            System.out.println(e);
        }

        //отпускание клавиши
        public void keyReleased(KeyEvent e) {
            System.out.println(e);
        }
    }
}
