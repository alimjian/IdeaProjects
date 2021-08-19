package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {



       Scanner s1=new Scanner(System.in);
        System.out.println("please enter first number.....");
        int n1=s1.nextInt();
        System.out.println("please enter second number....");
        int n2=s1.nextInt();
        System.out.printf(" %d + %d = %d",n1,n2,n1+n2);







    }
}
