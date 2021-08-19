package com.seleniummaster.loops;

public class ForEachLoop {
    public static void main(String[] args) {

        int sum=0;

        for (String i:args){
            System.out.println(i);
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);







    }


}
