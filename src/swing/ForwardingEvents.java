package swing;

/**
 * Техника диспетчеризации событий
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ForwardingEvents extends JFrame {

    //конструктор класса
    public ForwardingEvents(){
        super("ForwardingEvents");
        //при закрытии окна - выход
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //последовательное расположение
        getContentPane().setLayout(new FlowLayout());
        //добавим пару кнопок
        button1 = new JButton("OK");
        button2 = new JButton("Отмена");

        getContentPane().add(button1);
        getContentPane().add(button2);

        Forwarder forwarder = new Forwarder();

        button1.addActionListener(forwarder);
        button2.addActionListener(forwarder);

        setSize(200, 200);
        setVisible(true);
    }

    private JButton button1, button2;

    class Forwarder implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1){
                onOK(e);
            }

            if (e.getSource() == button2){
                onCancel(e);
            }
        }

        public void onOK(ActionEvent e){
            System.out.println("onOK()");
        }

        public void onCancel(ActionEvent e){
            System.out.println("onCancel()");
        }
    }

    public static void main(String[] args) {
        new ForwardingEvents();
    }
}
