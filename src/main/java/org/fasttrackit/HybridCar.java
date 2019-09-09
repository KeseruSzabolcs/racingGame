package org.fasttrackit;

public class HybridCar extends Vehicle{

    @Override
    public double accelerate(double speed, double durationInHours) {
        double actualSpeed = 2 * speed;
        double distance = actualSpeed * durationInHours;

        setTraveledDistance(getTraveledDistance() + distance);
        System.out.println("cheater!!!");
        System.out.println(getName() + "is accelerating with " + speed + " for " + durationInHours + " h");

        return distance;
    }
//co-variant return type
    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar();
    }
}
