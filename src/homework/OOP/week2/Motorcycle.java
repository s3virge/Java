package homework.oop.week2;

/**
 * Created by Vit on 06.07.2016.
 */
public class Motorcycle {
    private String sName;
    private String sNumber;

    public Motorcycle() {
        this.sName = "";
        this.sNumber = "";
    }

    public Motorcycle(String sName, String sNumber) {
        this.sName = sName;
        this.sNumber = sNumber;
    }

    public Motorcycle(Motorcycle oMoto) {
        this.sName = oMoto.getName();
        this.sNumber = oMoto.getNumber();;
    }

    public String getName() {
        return sName;
    }

    public String getNumber() {
        return sNumber;
    }

    public void print(){
            System.out.printf("%-15s%-10s\n", this.sName, this.sNumber);
    }
}
