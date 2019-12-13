package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<Integer, String> namesMap = new HashMap();
        namesMap.put(10,"karl");
        namesMap.put(20,"Rock");
        namesMap.put(3, "internet");

        String name = namesMap.get(10);
        System.out.println(name);

        for (Map.Entry entry : namesMap.entrySet())
        {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
