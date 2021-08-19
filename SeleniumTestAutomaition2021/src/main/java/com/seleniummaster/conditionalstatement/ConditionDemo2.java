package com.seleniummaster.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo2 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("please enter your score..");
        int score=input.nextInt();
        if (score>=0){
        if(score<=100&&score>=90)
            System.out.println("great !!!your great is 'A'.you win an ipad ");
        else if (score<90&&score>=80)
            System.out.println("great !!! your great is 'B',you win an iphone");
        else if (score<80&&score>=70)
            System.out.println("your great is 'C'");
        else if (score<70&&score>=60)
            System.out.println("you great is 'D'");
        else if (score<60)
            System.out.println("you failed the exam  ");}

            System.out.println("please enter valid score (score should be greater than 0)");
















    }
}
