package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name1, name2;
        int marksOfFirst, marksOfSecond;
        System.out.println("Enter name :");
        Scanner scan = new Scanner(System.in);
        name1 = scan.next();
        System.out.println("Enter marks of "+name1+" :");
        marksOfFirst = scan.nextInt();
        System.out.println();

        System.out.println("Enter name :");
        name2 = scan.next();
        System.out.println("Enter marks of "+name2+" :");
        marksOfSecond = scan.nextInt();
        System.out.println();
        System.out.println();

        marksOfFirst = marksOfFirst + marksOfSecond;
        marksOfSecond = marksOfFirst - marksOfSecond;
        marksOfFirst = marksOfFirst - marksOfSecond;

        System.out.println(name1 +" : "+ marksOfFirst);
        System.out.println(name2 +" : "+ marksOfSecond);







    }
}
