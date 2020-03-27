package com.company.vehicle;

//class Car does not have to be a finale since this class describes a specific car, not abstract point on the plane.
public class Car {
    private double milesOnGallon;
    private final double  startX = 0;
    private double x;
    private double fuel;

    public Car(double milesOnGallon){
        this.milesOnGallon = milesOnGallon;
    }

    public double getMilesOnGallon() {
        return milesOnGallon;
    }

    public double getStartX() {
        return startX;
    }

    public double getX() {
        return x;
    }

    public double getFuel(){
        return fuel;
    }

    public void addFuel(double fuel){
        this.fuel += fuel;
    }

    public void drive(double miles){
        if(Math.abs(fuel - 0) < 0.01){
            System.out.println("Car has't fuel");
            return;
        }else {
            double fuelNeed = miles / milesOnGallon;

            double fuelFact = (fuelNeed <= fuel ? fuelNeed : fuel);

            x += fuelFact * milesOnGallon;

            if(fuelNeed >= fuel){
                System.out.println("Car need refuel");
            }

            fuel -= fuelFact;

        }
    }

    public double getDistance(){
        return x - startX;
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesOnGallon=" + milesOnGallon +
                ", startX=" + startX +
                ", x=" + x +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.milesOnGallon, milesOnGallon) != 0) return false;
        if (Double.compare(car.startX, startX) != 0) return false;
        if (Double.compare(car.x, x) != 0) return false;
        return Double.compare(car.fuel, fuel) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(milesOnGallon);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(startX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fuel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
