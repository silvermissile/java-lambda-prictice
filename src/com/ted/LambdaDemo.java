package com.ted;

public class LambdaDemo {
    interface Printer {
        void print(String val);
    }

    public void printSomeThing(String str,Printer printer) {
        printer.print(str);
    }



    public static void main(String[] args) {

        /* 测试：最原始的方法 */
        test1();

       //使用匿名类
        test2();

        //使用lambda 表达式
        test3();

        //简化版的 lambda 表达式
        test4();



    }

    private static void test1() {
        LambdaDemo lambdaDemo = new LambdaDemo();

        Printer printer = new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };

        lambdaDemo.printSomeThing("测试：最原始的方法",printer);
    }

    private static void test2() {
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.printSomeThing("使用匿名类", new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        });
    }


    private static void test3() {
        LambdaDemo lambdaDemo = new LambdaDemo();
        Printer printer =(String str) -> {
            System.out.println(str);
        };

        lambdaDemo.printSomeThing("使用lambda 表达式", printer);
    }

    private static void test4() {
        LambdaDemo lambdaDemo=new LambdaDemo();

        Printer printer=val-> System.out.println(val);

        String str = "简化版的 lambda 表达式";
        lambdaDemo.printSomeThing(str,printer);
        lambdaDemo.printSomeThing(str,val -> System.out.println(val));
        }

    }


