package com.codecar.entity;

/**
 * Created by Paul on 9/14/2016.
 */
public class Car implements Comparable<Car>{
    private int carNumber;
    private String driverName;
    private double speed;

    public Car(int num, String name){
        carNumber = num;
        driverName = name;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", driverName='" + driverName + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(this.getSpeed() > o.getSpeed()) return 1;
        if(this.getSpeed() < o.getSpeed()) return -1;
        return 0;
    }
}
