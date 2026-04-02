package com.jvm.visualizer;

import com.jvm.visualizer.Classloader.ClassLoaderModule;

import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int option=0;
        while (option!=4){
            System.out.println("Select one option\n1.String\n2.ArrayList\n3.ClassLoaderModule\n4.Exit");
            option=sc.nextInt();
            switch (option){
                case 1: System.out.println(ClassLoaderModule.hierarchy (String.class));break;
                case 2: System.out.println(ClassLoaderModule.hierarchy (ArrayList.class));break;
                case 3: System.out.println(ClassLoaderModule.hierarchy (ClassLoaderModule.class));break;
                case 4: System.out.println("Thank you for using my code");break;
                default: System.out.println("Select a correct option");break;
            }
        }
    }
}