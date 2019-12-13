package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name;
        int age;
        String blood;
        String group = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student's Name :");
        name = scan.nextLine();

        System.out.println("Enter Student's Age :");
        age = scan.nextInt();

        System.out.println("Enter Student's Blood Group.");
        blood = scan.next();
        scan.close();


        if(age >= 20){
            group = "RED";
        }else if(age < 20 && age >15){
            group = "BLUE";
        }else if(age >= 10 && age < 15) {
            group = "YELLOW";
        }



        System.out.println();
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
        System.out.println("Blood Group : "+ blood);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Your Group is "+ group);
        System.out.println("-----------------------------------------------------------------------------");


    }
}
