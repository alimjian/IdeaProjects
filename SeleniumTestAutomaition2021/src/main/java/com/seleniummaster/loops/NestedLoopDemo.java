package com.seleniummaster.loops;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {

//
//        Scanner scanner=new Scanner(System.in);
//        int line=scanner.nextInt();
//        for (int i=1; i<=line;i++) {
//            System.out.println("**********");
//        }
//


              for (int i=1;i<=5;i++){
                 for (int j=1;j<=6-i;j++){
                     System.out.print("* ");
                 }
                 System.out.println();
             }

        System.out.println("--------------------------------");



              for (int i=1;i<=5;i++){
                  for (int j=6;j>i;j--){
                      System.out.print("* ");
                  }
                  System.out.println();
              }




    }
}
