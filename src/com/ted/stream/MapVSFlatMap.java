package com.ted.stream;

import java.util.Arrays;
import java.util.List;

public class MapVSFlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("helllo", "world");
        words.stream().map(w->{
            System.out.println("map w: "+w);
            return  Arrays.stream(w.split(""));
        }).forEach(System.out::println);

        //传递给map方法的Lambda为每个单词返回了一个String[]（String
        //列表）。因此， map 返回的流实际上是Stream<String[]> 类型的。你真正想要的是用
        //Stream<String>来表示一个字符流。因此，这是行不通的。



        //可以发现，在处理的时候 map 与 flatmap 是一样的，但是返回的时候，flatmap 把返回的结果展平了
        words.stream().flatMap(w->{
            System.out.println("flatmap w: "+w);
            return  Arrays.stream(w.split(""));
        }).forEach(System.out::println);
    }
}
