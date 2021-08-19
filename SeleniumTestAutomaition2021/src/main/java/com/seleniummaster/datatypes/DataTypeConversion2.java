package com.seleniummaster.datatypes;

public class DataTypeConversion2 {


    public static void main(String[] args) {

//        String age="20";
//        System.out.println(age+30);
//        int i1=Integer.parseInt(age);
//        System.out.println(i1+30);
//
//
//        double d1=Double.parseDouble(age);
//        System.out.println(d1);
//        System.out.printf("d1=%f",d1);
//
//        System.out.println();
//
//        float f1=Float.parseFloat(age);
//        System.out.println(f1);
//        System.out.printf("f1=%f",f1);


        String s2="100ABC";
        s2=s2.replace("ABC","");
        int i3=Integer.parseInt(s2);
        System.out.println(i3);


        String s3="100.000,000";
        s3=s3.replace(",000","").replace(".","");
        int i4=Integer.parseInt(s3);
        System.out.println(i4);


        int x=1000;
        float f=78979.78979f;
       String x1=String.valueOf(x);
        System.out.println(x1);
        String f1=String.valueOf(f);
        System.out.println(f1);











        




    }
}
