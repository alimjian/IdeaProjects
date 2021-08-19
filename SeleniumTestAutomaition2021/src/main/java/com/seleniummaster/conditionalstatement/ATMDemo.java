package com.seleniummaster.conditionalstatement;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class ATMDemo {
    public static void main(String[] args) {
        int pinNumber=245168; 
        int balance=10000;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your pin number ");
        String password=input.nextLine();
        if(StringUtils.isNumeric(password)) {
            if (pinNumber == Integer.parseInt(password)) {
                System.out.println("please select the menu(Transfer,Withdraw.Payment)");
                String menu = input.nextLine();
                System.out.println("please enter withdraw amount");
                int amount = input.nextInt();
                if (menu.equalsIgnoreCase("withdraw") && amount <= balance) {
                    System.out.println("preparing your cash,please check your money ");
                    System.out.printf("you current balance was %d ", balance - amount);
                } else {
                    System.out.println("withdraw amount can not greater than balance");
                }
            } else {
                System.out.println("Wrong password,please try again");
            }
        } else{
            System.out.println("please enter valid 6 digit number ");
        }
    }
}
