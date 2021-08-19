package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

         int x=100;
         int y=200;

        System.out.println(x+y);
        System.out.println(Math.addExact(x,y));
        System.out.println(String.format("%d+%d=%d",x,y,x+y));

        System.out.println(y-x);
        System.out.println(Math.multiplyExact(y,x));
        System.out.println(String.format("%d-%d=%d",y,x,y-x));


        System.out.println((x+y)/2);
        System.out.println(Math.abs(y-x));
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));


//        Scanner input=new Scanner(System.in);
//        int number1;
//        int number2;
//        System.out.println("please enter number 1...");
//        number1=input.nextInt();
//        System.out.println("please enter number 2...");
//        number2=input.nextInt();
//        if(number1==number2)
//            System.out.printf("%d==%d \n",number1,number2);
//        if (number1>number2)
//            System.out.printf("%d>%d \n",number1,number2);
//        if (number1!=number2)
//            System.out.printf("%d!=%d\n",number1,number2);


        Scanner s=new Scanner(System.in);
        System.out.println("What is your name?");
        String s1=s.nextLine();
        System.out.println("What is your house address?");
        String s2=s.nextLine();
        System.out.println("What is the name of the city?");
        String s3=s.nextLine();
        System.out.println("What is the state?");
        String s4=s.nextLine();
        System.out.printf("My full address is-- %s+%s+%s+%s",s1,s2,s3,s4);

















    }
}
