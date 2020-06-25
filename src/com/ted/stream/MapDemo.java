package com.ted.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("Monkey", "Lion", "Giraffe", "Limur");;


        //noMap(alpha);


        //List<String> collect = alpha.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        //System.out.println(collect);


        alpha.stream().mapToInt(s->s.length()).forEach(System.out::println);
    }

    private static void noMap(List<String> alpha) {
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alphaUpper);
    }
}












