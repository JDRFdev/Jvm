package com.jvm.visualizer.Classloader;

public class ClassLoaderModule {
    public static StringBuilder hierarchy(Class<?> class_){
        StringBuilder s= new StringBuilder();
        ClassLoader iterator=class_.getClassLoader();
        while (iterator!=null){
            if(s.length() > 0) s.append("->");
            s.append(iterator.getName());
            iterator=iterator.getParent();
        }
        return s;
    }
}
