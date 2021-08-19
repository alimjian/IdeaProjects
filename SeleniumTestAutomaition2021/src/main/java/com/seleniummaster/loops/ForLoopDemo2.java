package com.seleniummaster.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {


        int sum=0;
        for (int i=1;i<=10;i++) {
            sum += i;
            System.out.printf("I=%d   sum=%d \n", i, sum);
        }
        System.out.println("total summery:"+sum);
    }
}
