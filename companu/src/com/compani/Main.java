package com.compani;

import com.compani.details.Engine;
import com.compani.professions.Driver;
import com.compani.vehicles.Car;
import com.compani.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Косюк Алина", 5);

        Engine engine = new Engine(250, "Lada fiesta");

        Lorry lorry = new Lorry("Cumaz", "Грузовой", 5000, driver, engine, 10000);

        System.out.println(lorry.toString());

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());

        lorry.getEngine().setManufacturer("Haval");

        System.out.println("Производитель двигателя после изменений: " + lorry.getEngine().getManufacturer());
    }
}