package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1-single,2-married");

        int status = input.nextInt();
        System.out.println("pealse enter your salary: ");
        double salary = input.nextDouble();
        double tax = 0;
        if (status == 1) {
            if (salary <= 32000)
                tax = salary * 0.1;
            else if (salary > 32000)
                tax = 32000 * 0.1 + (salary - 32000) * 0.25;}
        System.out.println(tax);
            if (status == 2) {
                if (salary <= 64000)
                    tax = salary * 0.1;
                else if (salary > 64000)
                    tax = 64000 * 0.1 + (salary - 64000) * 0.25;
                System.out.println("your tax is =" + tax);
            }

        }
    }
