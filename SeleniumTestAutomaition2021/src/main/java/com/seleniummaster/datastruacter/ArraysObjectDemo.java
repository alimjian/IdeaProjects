package com.seleniummaster.datastruacter;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {


        int[] a1=new int[]{10,40,5,20,100};
        int[] a2=new int[]{30,400,50,200,1000};
        boolean b1= Arrays.equals(a1,a2);
        System.out.println(b1);

        int index=Arrays.binarySearch(a1,5);
        System.out.println(index);

        Arrays.fill(a1,10);
        System.out.println(Arrays.toString(a1));



        
    }

}
