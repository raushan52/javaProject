package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Area area = new Area();
        area.calculatingPerimeter();
    }
}

interface perimeter {
     void calculatingPerimeter();
}
class Area implements perimeter{
    int length= 10;
    int bredth = 20;
    @Override
     public void calculatingPerimeter(){

        System.out.println(2*(length+bredth));
    }
}