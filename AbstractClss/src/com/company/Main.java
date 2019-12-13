package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dogs dog = new Dogs();
        dog.dogs();

        Cats cat = new Cats();
        cat.cats();
    }
}
abstract class Animal {
    abstract void cats();
    abstract void dogs();

}
class Cats extends Animal{

    public void dogs(){

    }
    public void cats(){
        System.out.println("Cats Meow !");
    }

}
class Dogs extends Animal{
    @Override
    void cats() {

    }

    public void dogs() {
        System.out.println("Dogs Bark !");
    }

}

