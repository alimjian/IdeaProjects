package com.seleniummaster.datatypes;

public class OperatorsDemo {


    public static void main(String[] args) {


        int x=100;
        x+=100;
        System.out.println(x);

        int i=200;
        int b=300;
        System.out.println(i==b);//false
        System.out.println(i!=b);//true
        System.out.println(i>b);//false
        System.out.println(i<b);//true
        System.out.println(i>=b);//false
        System.out.println(i<=b);//true



        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(b1&&b3);
        System.out.println(!(b1&&b3));


        int number1=50;
        int number2=100;
        boolean result1=(number1==number2)&&(number2==20);
        boolean result2=(number1!=number2)&&(number2!=20);
        boolean result3=(number1==5)||(number2==100);
        System.out.println(String.format("result1=%b",result1));
        System.out.printf("result2=%b \n",result2);
        System.out.printf("result3=%b",result3);







    }
}
