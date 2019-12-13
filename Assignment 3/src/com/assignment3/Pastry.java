package com.assignment3;

public class Pastry extends Cake {

    @Override
    public void display() {

        System.out.println(getName() +" : "+" ₹ "+ getPrice() + " per piece");

    }

}
