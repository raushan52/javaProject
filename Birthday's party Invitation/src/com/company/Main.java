package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        System.out.println("Enter your name.");

        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Hey "+name +" , it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!! ");


    }
}
