package com.codecar.entity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Paul on 9/14/2016.
 */
public enum Driver {
    MARK_MARTIN(6),
    JEFF_GORDON(24),
    MARTIN_TRUEX(78),
    KEVIN_HARVICK(4),
    DALE_JR(88);

    private final int carNumber;
    private static final Map<Integer, Driver> NUMBER_TO_DRIVER = buildDriverToNumber();
    public static final List<Integer> ALL_CAR_NUMBERS = getAllCarNumbers();

    Driver(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public static Driver getDriverForId(int number){
        return NUMBER_TO_DRIVER.get(number);
    }

    private static Map<Integer, Driver> buildDriverToNumber(){
        Map<Integer, Driver> numberToDriver = new HashMap<Integer, Driver>();
        for (Driver driver : values()){
            numberToDriver.put(driver.getCarNumber(), driver);
        }
        return numberToDriver;
    }

    private static List<Integer> getAllCarNumbers(){
        return Collections.unmodifiableList(Arrays.stream(values()).map(Driver::getCarNumber).collect(Collectors.toList()));
    }
}
