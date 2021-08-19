package com.seleniummaster.datastruacter;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInArrey {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter array length: ");
        int lengthofarray=scanner.nextInt();
        int[] arr=new int[lengthofarray];



        //int[] arr={30,10,20,80,40,200,100};
        int maxvalue=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            if (maxvalue<arr[i]){
                maxvalue=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max number in array is: "+maxvalue);

    }
}
