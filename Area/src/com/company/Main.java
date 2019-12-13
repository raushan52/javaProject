package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Area area = new Area();
        System.out.println("Area of Rectangle");
        System.out.println("Enter length of Rectangle.");
        Scanner scan = new Scanner(System.in);
        double lengthOfRectangle = scan.nextDouble();
        System.out.println("Enter Bredth of Rectangle. ");
        double bredthOfRectangle = scan.nextDouble();
        double areaOfRectange = area.areaOfRectangle(lengthOfRectangle,bredthOfRectangle);
        System.out.println("Area of rectangle is : "+ areaOfRectange);
        System.out.println();


        System.out.println("Area of Square.");
        System.out.println("Enter Side of Square.");
        double sideOfSquare = scan.nextDouble();
        double areaOfSquare = area.areaOfSquare(sideOfSquare);
        System.out.println("Area of square is : "+ areaOfSquare);
        System.out.println();

        System.out.println("Area of Circle");
        System.out.println("Enter Radius of Circle.");
        double radiusOfCircle = scan.nextDouble();
        double areaOfCircle = area.areaOfCircle(radiusOfCircle);
        System.out.println("Area of Circle is :"+ areaOfCircle);








    }
}



class Area{



    double area;

    public double areaOfRectangle(double length, double bredth) {
        area = length * bredth;
        return area;
    }
    public double areaOfSquare(double side) {
        area = side * side;
        return area;
    }
    public double areaOfCircle(double radius) {
        double pi = 3.14;
         area = pi*radius*radius;
        return area;

    }
}
