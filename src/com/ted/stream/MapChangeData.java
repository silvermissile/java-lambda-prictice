package com.ted.stream;

import com.ted.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapChangeData {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");


        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5,e6);

        //因为 set 方法是没有返回值的  也特别 return
        Stream<Employee> employeeStream = employeeList.stream().map(employee -> {
            employee.setAge(employee.getAge() + 1);
            employee.setGender(employee.getGender().equals("M") ? "mail" : "femail");
            return employee;
        });

        System.out.println(employeeStream.collect(Collectors.toList()));



        //peek函数是一种特殊的map函数，当函数没有返回值或者参数就是返回值的时候可以使用peek函数。
        employeeList.stream().peek(e->{
            e.setAge((e.getAge() + 10));

        }).forEach(System.out::println);

    }
}
