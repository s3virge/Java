package homework.OOP.week3.circus;

/**
 * Created by Vit on 17.07.2016.
 */
public class Acrobat extends Artist {

    public Acrobat(String name) {
        super(name, "acrobat");
    }

    public void Performance(){
        super.setCountOfPerformance(super.getCountOfPerformance() + 1);
        System.out.println("Выступает акробат");
    }
}
