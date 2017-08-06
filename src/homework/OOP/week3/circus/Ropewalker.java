package homework.OOP.week3.circus;

/**
 * Created by Vit on 17.07.2016.
 */
public class Ropewalker extends Artist{

    public double percentageForTheRisk;

    public Ropewalker(String name) {
        super(name, "ropewalker");
    }

    public boolean setPercentageForTheRisk(double percentageForTheRisk) {

        if (percentageForTheRisk <= 0){
            return false;
        }

        this.percentageForTheRisk = percentageForTheRisk / 100;

        return true;
    }

    public double getSalary() {

        double basesalary = super.getSalary();

        return basesalary * percentageForTheRisk + basesalary;
    }

    public void Performance(){
        super.setCountOfPerformance(super.getCountOfPerformance() + 1);
        System.out.println("Выступает канатоходец");
    }
}
