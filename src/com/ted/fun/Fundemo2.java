package com.ted.fun;

import java.util.function.Function;

public class Fundemo2 {
    public static void main(String[] args) {
        Function<Integer, Integer> bin = e -> 2 * e;
        Function<Integer,Integer>  square = e->e*e;


        //compose  andthen 在 function 的源码中可以看到，控制 function 的执行顺序，一个前一个后
        System.out.println(bin.andThen(square).apply(3));
        System.out.println(bin.compose(square).apply(3));
    }
}
