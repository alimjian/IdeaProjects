package com.seleniummaster.datatypes;

public class DataTypeConversion {
    public static void main(String[] args) {
        //widening casting ---convert small to large

        int i1=100;
        long l1=i1;
        System.out.println(String.format("i1=%d \n l1=%d",i1,l1));

        int i2=200;
        double d1=i2;
        System.out.printf("i2=%d \n d1=%.1f \n ",i2,d1);

        char c='8';
        int i3=c;

        System.out.printf("i3=%d \n",i3);


        System.out.printf("i2=%d \n d1=%f ",i2,d1);







    }
}
