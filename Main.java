package com.company;

import java.util.Scanner;

public class Main {

    static long number;
    static int length,i=0;

    public static void main(String[] args) {

        System.out.println("It is binary converter, please enter the number: ");


        Scanner sc = new Scanner(System.in);
        number = sc.nextLong();

        long count = number;

        if (number<=127&&number>=-128)
            System.out.println("Byte is available");
        if (number<=32767&&number>=-32768)
            System.out.println("Short is available");
        if (number<=2147483647&&number>=-2147483648)
            System.out.println("Int is available");
        if (number<=9223372036854775807L&&number>=-9223372036854775808L)
            System.out.println("Long is available");

        while(count!=1){
            length++;
            count /= 2;
        }

        long[] mas = new long[length+1];

       while(number!=1){
          mas[i] = number%2;
           number /= 2;
           i++;
        }

        System.out.println("The number in Binary system is:");

        System.out.print(number);

       for(int f = length-1;f>=0;f--){
           System.out.print(mas[f]);
       }

    }
}
