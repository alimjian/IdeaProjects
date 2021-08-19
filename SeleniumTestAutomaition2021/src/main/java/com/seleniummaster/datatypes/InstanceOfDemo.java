package com.seleniummaster.datatypes;

public class InstanceOfDemo {
    public static void main(String[] args) {


        Integer  i=100;
        boolean b1=i instanceof Integer;
        System.out.println(b1);

        String s1=new String("hello");
        System.out.println(s1 instanceof Object);
        Number n=789790l;
        System.out.println(n instanceof Long);










    }
}
