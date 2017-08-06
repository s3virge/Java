package homework.OOP.week3.circus;

/**
 * Created by Vit on 17.07.2016.
 */
public class Artist {

    private String name;
    private String profession;
    private int salary;
    private int countOfPerformance;

    public Artist(String name, String profession) {
        this.name = name;
        this.profession = profession;
        this.salary = 0;
        this.countOfPerformance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCountOfPerformance() {
        return countOfPerformance;
    }

    public boolean setCountOfPerformance(int countOfPerformance) {

        if (countOfPerformance < 0) {
            return false;
        }

        this.countOfPerformance = countOfPerformance;
        return true;
    }

    public String toString(){
        return  "name: " + this.name +
                " profession: " + this.profession +
                " salary: " + this.salary +
                " performance: " + this.countOfPerformance;
    }
}
