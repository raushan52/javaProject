package com.assignment3;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pastry  pastry1 = new Pastry();
        Pastry  pastry2 = new Pastry();
        Cake cake1 = new Cake();
        Cake cake2 = new Cake();

        List<Cake> nameOfCake = new ArrayList<>();

        for (int i = 0; i<2; i++){

            System.out.println("Enter Cake's Name : ");
            cake1.setName(scan.nextLine());
            System.out.println("Enter Cake's price");
            cake1.setPrice(scan.nextFloat());
            scan.nextLine();
            nameOfCake.add(cake1);
            System.out.println();
            cake1 = cake2 ;
        }

            System.out.println();
            System.out.println();

        List<Pastry> nameOfPastry = new ArrayList<>();

        for (int i = 0; i<2; i++){

            System.out.println("Enter Pastry Name : ");
            pastry1.setName(scan.nextLine());
            System.out.println("Enter Pastry's Price");
            pastry1.setPrice(scan.nextFloat());
            scan.nextLine();
            nameOfPastry.add(pastry1);
            System.out.println();
            pastry1 = pastry2;
        }
        System.out.println();
        System.out.println();

        System.out.println("Today's Special Menu");
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("------------------------------------------------");
        for (Cake cakeName : nameOfCake) {

            cakeName.display();

        }
         System.out.println();


        System.out.println("Special Pastry");
        System.out.println("------------------------------------------------");
        for (Pastry pastryName : nameOfPastry) {

           pastryName.display();
       }
    }
}
