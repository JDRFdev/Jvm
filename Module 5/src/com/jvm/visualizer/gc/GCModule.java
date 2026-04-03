package com.jvm.visualizer.gc;

import java.util.ArrayList;
import java.util.List;

public class GCModule {
    static List<String> s=new ArrayList<String>();
    public static void heapSmashing(){
        System.out.println("This program has used:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
        for (int i=0;i<10000;i++){
            s.add(new String("SMASHSING"));
            if(s.size()%100==0) System.out.println("This program has used:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
        }
        s=null;
        System.gc();
        System.out.println("This program has used:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

    }
}
