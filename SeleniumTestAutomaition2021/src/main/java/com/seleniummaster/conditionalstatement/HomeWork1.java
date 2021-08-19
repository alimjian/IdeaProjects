package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please enter your salary :");
        double salary = input.nextDouble();
        double tax1 = 0.1;
        double tax2 = 0.25;
        double totaltax;
        double income1 = 32000;
        double income2 = 64000;
        System.out.println("Are you single?(true/false)");
        boolean isSingle = input.nextBoolean();

        if (isSingle == true) {
            if (salary <= income1) {
                totaltax = salary * tax1;
                System.out.printf("you are single so you will pay" + totaltax);
            }else {
                totaltax = (salary - income1) * 0.25 + (income1 * tax1);
                System.out.println(totaltax);

            }

        } else {
            if (salary<=64000){
                totaltax=income2*tax1;
                System.out.println(totaltax);
            }else {
                totaltax=(salary-income2)*tax2+(income2*tax1);
                System.out.println(totaltax);

            }






        }

        }
    }




