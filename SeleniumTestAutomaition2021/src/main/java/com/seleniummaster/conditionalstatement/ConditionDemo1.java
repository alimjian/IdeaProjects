package com.seleniummaster.conditionalstatement;

import java.util.Scanner;


public class   ConditionDemo1 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter first number...");
        int x=scanner.nextInt();
        System.out.println("please enter second number...");
        int y=scanner.nextInt();
        int z=x+y;
        System.out.printf("please enter the calculation result of %d and %d \n",x,y);
        int result=scanner.nextInt();
        if(result==z){
            System.out.println("good job");

        }else {
            System.out.println("opps!!!wrong calculation, please try again!!!");
        }

        }
    }

