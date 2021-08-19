package com.seleniummaster.datatypes;

public class ArthmeticOperatorsDemo {


    public static void main(String[] args) {

        //Calculate rectangle area--h*W
        //Premier of rectangle--(w+h)*2

        int width=10;
        int height=12;
        int area=width*height;
        int premier=2*(width+height);
        System.out.println("area of rectangle is: "+area);
        System.out.println("premier of rectangle is: "+premier);

        float division=(float)width/height;
        System.out.printf("division=%f \n" ,division);

        System.out.println(5%3);
        System.out.println(10%9);


        int i=1;
        int j=2;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);
        i++;
        j--;
        i=i+4;

        System.out.println(i);
        System.out.println(j);





         




    }
}
