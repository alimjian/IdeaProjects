package com.seleniummaster.datastruacter;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {

        int[] arrey=new int[]{20,90,40,400,50,300,200};
        Arrays.sort(arrey);
        System.out.println(Arrays.toString(arrey));


        for (int i=arrey.length-1;i>=0;i--){
            System.out.print(arrey[i]+" ");
        }





    }
}
