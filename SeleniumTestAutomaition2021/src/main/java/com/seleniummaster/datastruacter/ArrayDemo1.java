package com.seleniummaster.datastruacter;

public class ArrayDemo1 {
    public static void main(String[] args) {

//        for (int i=1;i<=30;i++){
//            System.out.println(i);
//        }
//        for (int i=1;i<=30;i++){
//            if (i%2==0)
//                System.out.println(i);
//        }
//
//        for (int i=1;i<=30;i++){
//            if (i%2!=0)
//                System.out.println(i);
//        }
//
//        int sum =0;
//        for (int i=1;i<=30;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        int[]  a=new int[5];
        a[0]=200;
        a[1]=300;
        a[2]=400;
        a[3]=500;
        a[4]=600;
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a.length);

        for (int i=0;i<=a.length-1;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        for (int alim:a){
            System.out.print(" "+alim);
        }












    }
}
