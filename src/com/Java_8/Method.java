package com.Java_8;

import java.util.Arrays;
import java.util.List;

public class Method {
    public static void hello(String st){
        System.out.println(st);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("helly","mick","click","clock");
       // list.forEach(x-> System.out.println(x));
        list.forEach(Method::hello);
    }
}
