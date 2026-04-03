package com.jvm.visualizer.stack;

public class StackModule {
    private static int count;
    public static void stackSmashing(int c){
        count++;
         stackSmashing(count);
    }
    public static void run(){
        try {
            stackSmashing(count);
        }catch (StackOverflowError error){
            System.out.println("Depth:"+count);
            error.printStackTrace();}
    }
}
