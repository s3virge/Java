package homework.oop.week2;

public class Address {

    private String sCountry;
    private String sCity;
    private String sStreet;
    private String sHouseNum;
    private String sApartmentNum;

    public Address(String sCountry, String sCity, String sStreet, String sHouseNum, String sApartmentNum) {
        this.sCountry = sCountry;
        this.sCity = sCity;
        this.sStreet = sStreet;
        this.sHouseNum = sHouseNum;
        this.sApartmentNum = sApartmentNum;
    }

    public String getCountry() {
        return sCountry;
    }

    public void setCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getCity() {
        return sCity;
    }

    public void setCity(String sCity) {
        this.sCity = sCity;
    }

    public String getStreet() {
        return sStreet;
    }

    public void setStreet(String sStreet) {
        this.sStreet = sStreet;
    }

    public String getHouseNum() {
        return sHouseNum;
    }

    public void setHouseNum(String sHouseNum) {
        this.sHouseNum = sHouseNum;
    }

    public String getApartmentNum() {
        return sApartmentNum;
    }

    public void setApartmentNum(String sApartmentNum) {
        this.sApartmentNum = sApartmentNum;
    }

    public void showInfo() {

        System.out.printf("Country: %s\n" +
                        "City: %s\n" +
                        "Street: %s\n" +
                        "HouseNum: %s\n" +
                        "ApartmentNum: %s\n",
                        sCountry,
                        sCity,
                        sStreet,
                        sHouseNum,
                        sApartmentNum);
    }
}
