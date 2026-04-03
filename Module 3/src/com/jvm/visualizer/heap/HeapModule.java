package com.jvm.visualizer.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapModule {
    static List<String> s=new ArrayList<String>();
    public static void heapSmashing(){
        System.out.println("This program has used:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
        while (true){
            s.add(new String("SMASHSING"));
            if(s.size()%100000==0) System.out.println("This program has used:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
        }
    }
}
