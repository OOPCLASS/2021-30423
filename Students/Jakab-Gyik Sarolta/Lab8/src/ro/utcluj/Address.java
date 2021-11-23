package ro.utcluj;

public class Address {
    public String streetName;
    public int number;
    public int apartmentNumber;
    public String cityName;

    public Address(String streetName, int number, int apartmentNumber, String cityName) {
        this.streetName = streetName;
        this.number = number;
        this.apartmentNumber = apartmentNumber;
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
