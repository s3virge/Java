package homework.oop.week2.parking;

import homework.oop.week2.Motorcycle;
import homework.oop.week2.Address;

import java.util.Arrays;

/**
 * class parking
 */

public class Parking {

    private Motorcycle[] arrParkingPlaces;
    private int numberOfPlaces;
    private boolean bOpen;
    private Address garageAddress;
    private int numberOfFreePlaces;

    public Parking(Address oGarageAddress, int iNumerOfPlaces) {
        this.garageAddress = oGarageAddress;
        this.numberOfPlaces = iNumerOfPlaces;
        this.arrParkingPlaces = new Motorcycle[numberOfPlaces + 1]; //zero cell do not use
        this.bOpen = false;
        this.numberOfFreePlaces = iNumerOfPlaces;
    }

    public void addMotoOnLastFreePlace(Motorcycle oMoto){
        if (this.bOpen){
            if (this.numberOfFreePlaces > 0){
                for (int i = 1; i <= arrParkingPlaces.length; i++) {
                    if (arrParkingPlaces[i] == null){
                        arrParkingPlaces[i] = oMoto;
                        this.numberOfFreePlaces--;
                        return;
                    }
                }
            }
            else{
                System.out.println(">>>  No free places.  <<<");
            }
        }
        else {
            System.out.println(">>>  Cant add Moto On Last Free Place. Garage is closed.   <<<");
        }
    }

    public Motorcycle takeLastMoto(){
        if (this.bOpen){
            for (int i = arrParkingPlaces.length - 1; i > 0 ; i--) {
                if (!isPlaceNumberFree(i)){
                    Motorcycle oMotor = new Motorcycle(arrParkingPlaces[i]);
                    //oMotor = arrParkingPlaces[i];
                    arrParkingPlaces[i] = null;
                    return oMotor;
                }
            }
        }
        else{
            System.out.println(">>>  Cant take last moto. Garage is closed.   <<<");
        }
        return null;
    }

    public void addMotoByPlaceNumber(Motorcycle oMoto, int iPlaceNum){
        if (iPlaceNum <= this.numberOfPlaces){
            if (this.bOpen){
                if (isPlaceNumberFree(iPlaceNum)){
                    arrParkingPlaces[iPlaceNum] = oMoto;
                }
                else{
                    System.out.printf(">>>  parking place %d is busy.  <<<\n", iPlaceNum);
                }
            }
            else{
                System.out.println(">>>  Cant add moto by place number. Garage is closed.   <<<");
            }
        }
        else{
            System.out.printf(">>>  parking place %d does not exist.  <<<\n", iPlaceNum);
        }

        return;
    }

    public boolean isPlaceNumberFree(int iPlaceNum){
        if (arrParkingPlaces[iPlaceNum] == null){
            return true;
        }
        return false;
    }

    public Motorcycle takeMotoByPlaceNumber(int iPlaceNum){
        if (iPlaceNum <= this.numberOfPlaces){
            if (this.bOpen){
                if (!isPlaceNumberFree(iPlaceNum)){
                    Motorcycle oMotor = new Motorcycle(arrParkingPlaces[iPlaceNum]);
                    arrParkingPlaces[iPlaceNum] = null;
                    return oMotor;
                }
                else{
                    System.out.printf(">>>  The parking place %d is empty.  <<<", iPlaceNum);
                }
            }
            else{
                System.out.println(">>>  Cant take moto by place number. Garage is closed.   <<<");
            }
        }
        else{
            System.out.printf(">>>  parking place %d does not exist.  <<<\n", iPlaceNum);
        }
        return null;
    }

    public void clearGaragePlaces(){
        if (this.bOpen){
            Arrays.fill(arrParkingPlaces, null);
        }
        else{
            System.out.println(">>>  Cant clear garage places. Garage is closed.   <<<");
        }

        /*for (int i = 0; i < arrParkingPlaces.length; i++) {
            arrParkingPlaces[i] = null;
        }*/
    }

    public void open(){
        System.out.println("Now garage is open");
        this.bOpen = true;
    }

    public void close(){
        System.out.println("Now garage is closed");
        this.bOpen = false;
    }

    public void changeAddress(String sCountry, String sCity, String sStreet, String sHouseNum, String sApartmentNum){
        if (!this.bOpen) {
            this.garageAddress.setCountry(sCountry);
            this.garageAddress.setCity(sCity);
            this.garageAddress.setStreet(sStreet);
            this.garageAddress.setHouseNum(sHouseNum);
            this.garageAddress.setApartmentNum(sApartmentNum);
        }
    }

    public void showAllInGarage(){
        System.out.printf("%-15s%-15s%-10s\n","parking Place", "Name", "Numbre");
        System.out.println("------------------------------------------");

        for (int i = 1; i < arrParkingPlaces.length; i++) {
            if (arrParkingPlaces[i] == null){
                //System.out.printf("%-15d%-15s%-10s\n", i, "", "");
                System.out.printf("%d\n", i);
            }
            else{
                System.out.printf("%-15d%-15s%-10s\n", i, arrParkingPlaces[i].getName(), arrParkingPlaces[i].getNumber());
            }
        }

        System.out.println("------------------------------------------");
    }
}
