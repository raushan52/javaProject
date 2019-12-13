package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Time and Date is : ");
        System.out.println(time.format(date));
    }
}
