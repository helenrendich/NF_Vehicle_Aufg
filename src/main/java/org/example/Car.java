package org.example;

public class Car extends Vehicle {

    public int accelerate (int kmh){

        int newVelocity = velocity + kmh;
        System.out.println("The new velocity is: " + newVelocity);
        return newVelocity;

    }
};
