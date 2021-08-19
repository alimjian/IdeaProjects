package com.seleniummaster.datastruacter;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] b=new int[]{20,30,50,90,100};
        System.out.println(b.length);
        System.out.println(b[3]);
        int sum=0;
        for (int i=0;i<=b.length-1;i++){
            System.out.print(b[i]+" " );
            sum+=b[i];
        }

        System.out.println(sum);

        System.out.println(sum);
        System.out.println();
        for (int alim:b){
            System.out.print(alim+" ");

        }
        System.out.println();

        System.out.println(b);
        System.out.println(Arrays.toString(b));


    }
}
