package homework.oop.week2.biker;

import homework.oop.week2.Motorcycle;

/**
 * Created by s3virge on 08.07.2016.
 */
public class TestBiker {
    public static void main(String[] args) {

        Biker oBiker = new Biker("Vasya Pupkin");
        Motorcycle oBike = new Motorcycle("Harley", "31510MM");

        oBiker.buyMotorcycle(oBike);

        oBiker.print();

        oBiker.fixMotorcycle(new Repairs("20.07.2016", "Поршень", 2000));
        oBiker.fixMotorcycle(new Repairs("20.08.2016", "Выхлопная", 1200));
        oBiker.fixMotorcycle(new Repairs("3.08.2016", "Колесо", 800));

        oBiker.printRepairs();
        oBiker.sellMotorcycle();
        oBiker.print();
    }
}
