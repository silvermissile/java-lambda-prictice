package com.ted.fun;


import java.util.function.Function;

public class FunDemo<In, Out> {


    //使用内部匿名类
    //private Function<In,Out> processor = new Function<In, Out>() {
    //    @Override
    //    public Out apply(In in) {
    //        return (Out) new String("apply" + in);
    //
    //    }
    //};

    //使用 lambda 表达式
    private Function<In, Out> processor = in -> {return  (Out) new String("apply"+in);};

    public static void main(String[] args) {
        FunDemo<String, String> funDemo = new FunDemo<>();
        System.out.println(funDemo.processor.apply("fundemo"));



    }
}
