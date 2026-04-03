package com.jvm.visualizer.stringpool;

public class StringPoolModule {
    public static void verifyString(){
        String s1="Hi";
        String s2=new String("Hi");
        String s3="Hi";
        if(s1.equals(s2)){System.out.println("We have the same content, maybe we don't have the same reference though");}
        if(s1==s2){System.out.println("We have the same content and the same reference");}
        else {System.out.println("Perhaps we have the same content, we don't have the same reference though");}
        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        if(s1.equals(s3)){System.out.println("We have the same content, maybe we don't have the same reference though");}
        if(s1==s3){System.out.println("We have the same content and the same reference");}
    }
}
