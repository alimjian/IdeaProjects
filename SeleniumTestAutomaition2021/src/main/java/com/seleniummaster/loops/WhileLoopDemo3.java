package com.seleniummaster.loops;

import java.util.Scanner;

public class WhileLoopDemo3 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int positiveNumberCounts=0;
        int negativeNumberCounts=0;

        while (true){
            int numbers=scanner.nextInt();
            if (numbers>0){
                positiveNumberCounts++;
            }
            else if (numbers<0){
                negativeNumberCounts++;
            }
            else
                break;
        }
        System.out.println("negative number counts"+negativeNumberCounts);
        System.out.println("positive number counts"+positiveNumberCounts);

    }
}
