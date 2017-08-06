package homework.OOP.week3.circus;

/**
 * Created by Vit on 17.07.2016.
 */
public class Clown extends Artist {

    public Clown(String name) {
        super(name, "clown");
    }

    public void Performance(){
        super.setCountOfPerformance(super.getCountOfPerformance() + 1);
        System.out.println("Выступает клоун");
    }
}
