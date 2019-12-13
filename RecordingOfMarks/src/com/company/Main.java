package com.company;

import java.util.ArrayList;


import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> nameOfStudent = new ArrayList();
        nameOfStudent.add("panda");
        nameOfStudent.add("roshan");
        nameOfStudent.add("dalli");

        List<Integer> rollNoOfStudent = new ArrayList();
        rollNoOfStudent.add(10);
        rollNoOfStudent.add(11);
        rollNoOfStudent.add(25);


        List<Double> marksOfStudent = new ArrayList();
        marksOfStudent.add(255.02);
        marksOfStudent.add(578.23);
        marksOfStudent.add(152.56);

        for (int i=0;i<3;i++){
            System.out.println("name  : "+nameOfStudent.get(i)+"      Roll no : "+ rollNoOfStudent.get(i)+ "    Marks : "+ marksOfStudent.get(i));

        }
    }
}
