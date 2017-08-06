package homework.oop.week2.parking;

import homework.oop.week2.Motorcycle;
import homework.oop.week2.Address;

/**
 * Created by Vit on 06.07.2016.
 */
public class TestParking {
    public static void main(String[] args) {

        Parking oParking = new Parking(new Address("Ukraine", "Kharkiv", "Roganska", "142", "66"), 7);
        Motorcycle oMoto1 = new Motorcycle("Honda", "AX 3423");

        oMoto1.print();

        oParking.addMotoOnLastFreePlace(oMoto1);

        oParking.open();

        oParking.addMotoOnLastFreePlace(oMoto1);

        Motorcycle oMoto2 = new Motorcycle("Verhovina", "AA 1236");
        oParking.addMotoByPlaceNumber(oMoto2, 3);

        Motorcycle oMoto3 = new Motorcycle("Suzuki", "DS 1884");
        oParking.addMotoByPlaceNumber(oMoto3, 11);
        oParking.addMotoByPlaceNumber(oMoto3, 5);

        oParking.showAllInGarage();

        System.out.print("\nTake last moto  ");
        Motorcycle oMoto4 = oParking.takeLastMoto();
        oMoto4.print();
        System.out.println();

        System.out.print("\nTake last moto  ");
        oMoto4 = oParking.takeLastMoto();
        oMoto4.print();
        System.out.println();

        System.out.print("\nTake last moto  ");
        oMoto4 = oParking.takeLastMoto();
        oMoto4.print();
        System.out.println();

        System.out.print("\nTake last moto  ");
        oMoto4 = oParking.takeLastMoto();

        if (oMoto4 != null){
            oMoto4.print();
        }

        System.out.println();

        oParking.showAllInGarage();

        oMoto4 = oParking.takeMotoByPlaceNumber(11);

        if (oMoto4 != null){
            oMoto4.print();
        }

        oParking.clearGaragePlaces();
        oParking.showAllInGarage();

        oParking.close();
    }
}
