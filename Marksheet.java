package com.company;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        System.out.println("Enter marks of all subjects");
        Scanner sc =new Scanner(System.in);
        System.out.println("Mathematics: ");
        float a= sc.nextFloat();
        System.out.println("Physics: ");
        float b= sc.nextFloat();
        System.out.println("Chemistry: ");
        float c= sc.nextFloat();
        System.out.println("English: ");
        float d= sc.nextFloat();
        System.out.println("Hindi: ");
        float e= sc.nextFloat();
        float percentage= (a+b+c+d+e)/5.0f;
        System.out.println("Percentage obtained: "+percentage);
        System.out.println("What is your name");
//        Scanner sc=new Scanner(System.in);
//        String p=sc.nextLine();
//        System.out.println("hello! "+p);

    }
}


