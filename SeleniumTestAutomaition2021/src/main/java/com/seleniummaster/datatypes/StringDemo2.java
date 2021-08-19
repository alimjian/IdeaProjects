package com.seleniummaster.datatypes;


import java.util.Locale;

public class StringDemo2 {

    public static void main(String[] args) {

        String school="United Coder";
        String course="Java Selenium Test Automation";

        System.out.println(school.indexOf("t"));
        System.out.println(course.indexOf("e"));
        System.out.println(course.indexOf('e',course.indexOf('e')+1));
        System.out.println(course.lastIndexOf("e"));
        System.out.println(school.indexOf("d"));
        System.out.println(school.lastIndexOf("d"));

        System.out.println(course.indexOf("j"));
        System.out.println(course.indexOf("J"));
        System.out.println(course.indexOf("Test"));


        System.out.println(school.length());
        System.out.println(course.length());


        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(course.toLowerCase());
        System.out.println(course.toUpperCase());

        course=course.replace("Java","Python");
        System.out.println("After Replace  " +course);


        String data="2021-01-01";
        data=data.replace("-","/");
        System.out.println(data);

        course=course.replace(" ","");
        System.out.println(course);

        String status="  All Test Passed  ";
        System.out.println(status.indexOf("S"));
        System.out.println(status.indexOf("T"));
        System.out.println(status.length());

        status=status.trim();
        System.out.println(status.length());

        System.out.println(course.substring(6,14));


        int length="Automation".length();
        System.out.println(length);

        int indexofA=course.indexOf("A");
        System.out.println(indexofA);

        System.out.println(course.substring(indexofA,indexofA+length));


        String course1="Java Selenium Test Automation";

        int a="Test".length();
        System.out.println(a);

        int b=course.indexOf("T");
        System.out.println(b);

        System.out.println(course1.substring(b,b+a));

        String s1="Java";
        String s2="java";
        String s3="Java is fun";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        boolean b1=s3.contains(s1);
        System.out.println(b1);

        boolean b2=s3.contains(s2);
        System.out.println(b2);


        System.out.println(s3.charAt(a));











































     }


}


