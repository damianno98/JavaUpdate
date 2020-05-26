package com.company.z2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Z2 {

    public void getPositiveElements(){
        var integersCollection = new LinkedList<Integer>(){{
            add(6);
            add(2);
            add(-1);
            add(12);
            add(0);
            add(-16);
        }};
        List<Integer> copyInteger = integersCollection.stream().collect(Collectors.toUnmodifiableList());
        copyInteger.stream().filter(integer -> integer > 0).forEach(System.out::println);
        try{
            System.out.println("Trying to add element...");
            copyInteger.add(100);
        } catch (Exception e){
            System.out.println("Cannot add element to list!");
            e.printStackTrace();
        }
    }
}
