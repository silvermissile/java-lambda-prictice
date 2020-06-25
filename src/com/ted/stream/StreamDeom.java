package com.ted.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDeom {

    public static void main(String[] args) throws IOException {
        //所有的集合类都可以转为流

        //list 转为 stream
        List<String> phoneList = Arrays.asList("apple", "xiaomi", "vivo", "oppo", "huawei");
        sort(phoneList.stream());


        //array 转为 stream
        String[]  phoneArray={"apple", "xiaomi", "vivo", "oppo", "huawei"};
        sort(Stream.of(phoneArray));

        //file 转为 stream
        //需要修改绝对路径，文件内容为每行一个元素
        sort(Files.lines(Paths.get("/Users/rf/xuefeng/workspace/java-lambda-prictice/src/phones.txt")));



    }

    private static void sort(Stream<String> stream) {
        List<String> sorted = stream.filter(s -> s.length() < 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
