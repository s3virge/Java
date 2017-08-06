package homework.oop.week2.biker;

import homework.oop.week2.Motorcycle;

import java.util.Vector;

/**
 * class biker
     methods
     - buyMotorcycle
     - sellMotorcycle
     - fixMotorcycle
 */

public class Biker {

    private String sName;
    private Motorcycle oBike;
    private Vector<Repairs> vRepairs;

    public Biker(String sName) {
        this.sName = sName;
    }

    public void buyMotorcycle(Motorcycle oMoto){
        this.oBike = oMoto;
        this.vRepairs = new Vector<Repairs>();
    }

    public void sellMotorcycle(){
        this.oBike = null;
        this.vRepairs.removeAllElements();
    }

    public void fixMotorcycle(Repairs oRepairs){
        this.vRepairs.addElement(oRepairs);
    }

    public void print(){
        if (this.oBike != null) {
            System.out.printf("%-15s%-15s%-15s\n", this.sName, oBike.getName(), oBike.getNumber());
        }
        else {
            System.out.println("biker dos not have a bike.");
        }

    }

    public void printRepairs(){
        System.out.printf("%-15s%-15s%-15s\n", "Data", "Detail", "Price");
        System.out.println("--------------------------------------");

        for (Repairs oRep : this.vRepairs) {
            System.out.printf("%-15s%-15s%-15d\n", oRep.getRepaireDate(), oRep.getDetail(), oRep.getDetailPrice());;
        }
    }
}