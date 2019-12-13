package com.raushan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {

    public static void main(String [] args){

        int[] array = new int[101];
        for(int i=0; i<=100; i++){
            array[i] = i;

        }


        int [] numberArray = IntStream.rangeClosed(0,100).toArray();


        List<Integer> numList = new ArrayList<>();

        for(int i = 0; i<= 100; i++){
            numList.add(new Integer(i));
        }


            List<Integer> numbersList = IntStream.rangeClosed(0,100).mapToObj(i ->  new Integer(i)).collect(Collectors.toList());

    }


}
