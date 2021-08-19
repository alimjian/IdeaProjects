package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your school name...");
        String name=input.next();
        System.out.println("please enter your school address...");
        String address=input.next();
        System.out.println("please enter your school zip code...");
        String zipcode=input.next();
        System.out.printf("your school full address is %s %s %s",name,address,zipcode);






    }
}
