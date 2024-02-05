package com.sunjian.test;

import java.util.Scanner;

public class Demo {
    static String a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        if(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println("int型："+a);
        }else if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            System.out.println("double类型："+a);
        }else {
            System.out.println("输入错误");
        }

    }
}
