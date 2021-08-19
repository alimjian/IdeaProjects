package com.seleniummaster.datatypes;

    public class DataTypeDemo1 {

    public static void main(String[] args) {
// For integer--byte, short, int, long
        byte b1=120;
        System.out.println(b1);
        short s1=2000;
        System.out.println(s1);
        s1=3000;
        System.out.println(s1);
        int age=27;
        int addition=b1+s1;
        System.out.println("My age is: "+age);
        System.out.println("addition of b1 and s1 is:"+addition);
        long l1=1987655433;
        System.out.println(l1);
        //decimal digits--- float, double
        float f1=678.9894f;
        System.out.println(f1);
        double d1=8788.9897;
        System.out.println(d1);

        int x=10;
        int y=3;
        float z=((float)10)/3;
        System.out.println(z);

        //bloolean--true false
        boolean result=true;
        boolean status=false;
        System.out.println("\"Successfull massege display test result is passed\" "+"is-"+result);
        System.out.println("\"Successfull massege not display test result is passed\" "+"is-"+status);
        System.out.println(10>5);
        boolean comparison=4>20;
        System.out.println(comparison);

        //char
        char c1='A';
        char c2='b';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1+c2);
        //ASCII code
        int t=c1;
        int d=c2;
        char c3=66;
        System.out.println(c3);
        System.out.println(t);
        System.out.println(d);
        System.out.println(c1+c2);

        System.out.println(String.format("My current age is %d",age ));

        System.out.println(String.format("My ege is %d",l1));

        System.out.println(String.format(x+"+"+y+"="+(x+y)));
        System.out.println(String.format("%d+%d=%d",x,y,x+y));
        System.out.println(String.format("%f+%f=%f",f1,d1,f1+d1));
        System.out.println(String.format("%f+%f=%.3f",f1,d1,f1+d1));

        System.out.println(String.format("%d / %d=%f",x,y,(float)x/y));

        System.out.println(String.format("%d / %d=%f",y,x,(float)y/x));
        System.out.println(String.format("%s / %s=%s",y,x,y/x));







        String city="Istanbul";
        String country="Turkey";
        String erea="zeytinbornu";
        System.out.println(String.format("I living in %s %s %s",country,city,erea));



        //System.out.println(x+" +"+y+" = "+(x+y));



        System.out.println(String.format("%f + %f=%.2f",f1 ,d1,f1+d1));

    }


    }

