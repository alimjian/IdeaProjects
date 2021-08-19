package com.seleniummaster.datatypes;

public class  StringConcatenation {


    public static void main(String[] args) {
        //String concatenation ,Hello World

        String s1="hello";
        String s2="world!!";
        String s4=", ";
        String s3=s1+s4+s2;
        System.out.println(s3);
        // numric String
        String s5="10";
        String s6="20";
        System.out.println(s5+s6);

        int a=100;
        int b=200;
        String x="Hi";
        String y="Jave";
        String z="50";
        System.out.println(a+b);
        System.out.println(a+z);
        System.out.println(x+y);
        System.out.println(a+b+z+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.println(a+b+x+y+a+b);

        String s7="Selenium";
        String s8="Master";
        System.out.println(s7+" "+s8);
        System.out.println(s7.concat(" "+s8));
        // Format
        System.out.println(String.format("Welcom come to %s %s",s7,s8));
        System.out.println(String.format("France Paris %s %s",s8,s7));

        String country="France";
        String city="Paris";
        String erea="ozvag";
        System.out.println(String.format("I Live in %s %s %s",country,city,erea));






    }
}
