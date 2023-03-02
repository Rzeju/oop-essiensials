package pl.code_cool;

public class Address {

    private String streetName;
    private int houseNumber;
    private int flatNumber;

    public Address(String streetName, int houseNumber, int flatNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }
}
