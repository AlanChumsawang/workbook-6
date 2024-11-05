package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        Person p = new Person("Dad", "Jerez", 35);
        Person a = new Person("Mom", "Jerez", 35);
        Person b = new Person("damian", "Jerez", 27);
        Person d = new Person("Samson", "Jerez", 9);
        myFamily.add(p);
        myFamily.add(a);
        myFamily.add(b);
        myFamily.add(d);

        Collections.sort(myFamily);
        Collections.reverse(myFamily);

        for(Person h : myFamily){
            System.out.println(h);
        }
    }
}
