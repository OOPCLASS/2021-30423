package com.company.model;

public class Car extends Product{
    private int yearOfFabrication;
    private int mileage;
    private String carCondition;

    public Car(int yearOfFabrication, int mileage, String carCondition) {
        this.yearOfFabrication = yearOfFabrication;
        this.mileage = mileage;
        this.carCondition = carCondition;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void driveCar(int mi){
        this.mileage += mi;
    }

    public void driveCar(int mi, int days){
        for(int i = 0; i < days; i++){
            this.mileage += mi;
        }
    }

    @Override
    public String getDescription(){
        return carCondition;
    }

}
