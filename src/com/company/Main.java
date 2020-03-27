package com.company;

import com.company.geometry.Point;
import com.company.vehicle.Car;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        Car car = new Car(100);
        car.addFuel(10);
        car.drive(500);
        car.drive(100);
        System.out.println(car.getDistance()+" "+car.getFuel());
        System.out.println(car.getDistance());
        System.out.println(car);
    }
}
