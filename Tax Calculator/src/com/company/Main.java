package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Tax Calculator App");
        System.out.println("------Welcome-----");

        int numberOfPerson;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total person count :");
        numberOfPerson = scan.nextInt();

        String[] namesOfPerson = new String[numberOfPerson];

        long[] incomeOfPerson = new long[numberOfPerson];
            int j = 1;
            for(int i = 0; i < numberOfPerson; i++){


                System.out.println("Enter name "+(j++)+ " :");
                namesOfPerson[i] = scan.next();
                System.out.println("Enter "+scan.nextLine()+ " Annual Income :");
                incomeOfPerson[i] = scan.nextLong();
                System.out.println();


            }
                System.out.println();
                System.out.println();


                 System.out.println("Names with liable taxes");
                 System.out.println("-----------------------");


            for (int i = 0; i< namesOfPerson.length; i++){

                String nameForCalculate = namesOfPerson[i];
                long incomeforCalculate = incomeOfPerson[i];

                calculateTax(nameForCalculate, incomeforCalculate);

            }

            scan.close();


    }

    static void calculateTax(String name, long income) {

        long incomeTax = 0;
        if(income >= 300000){
            incomeTax = income *20 / 100;
        }else if (income >= 100000 && income < 300000){
            incomeTax = income * 10/100;
        }else if (income > 100000){
            incomeTax = 0;
        }

        System.out.println(name +" : " + incomeTax);

    }

}
