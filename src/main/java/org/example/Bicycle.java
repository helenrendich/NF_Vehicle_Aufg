package org.example;

public class Bicycle extends Vehicle{

    public int accelerate (int kmh){
        int newVelocity = velocity + kmh;
        if(newVelocity > 35){
            newVelocity = 35;
            System.out.println("Geschwindigkeit ist ueber 35");
        }

        System.out.println("The new velocity is: " + newVelocity);
        return newVelocity;

    }

}
