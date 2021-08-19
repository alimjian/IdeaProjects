package com.seleniummaster.datatypes;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.abs(-200));
        System.out.println(Math.min(12131,313131));
        System.out.println(Math.max(6890878,6786868));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(10,5));


        System.out.println(Math.random());
        int randomNomber=(int)(Math.random()*11);

        System.out.println(randomNomber);

        Random random=new Random();

       long numbers=10000000000l+(long)(random.nextDouble()*999999999l);
        System.out.println(numbers);














    }
}
