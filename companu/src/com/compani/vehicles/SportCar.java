package com.compani.vehicles;

import com.compani.details.Engine;
import com.compani.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

