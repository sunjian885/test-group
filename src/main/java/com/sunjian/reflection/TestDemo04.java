package com.sunjian.reflection;

import java.lang.reflect.Method;

//分析性能问题
public class TestDemo04 {
    //普通方式调用
    public static void test01(){
        User user = new User();
        Long starTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("普通方式调用:"+(endTime-starTime)+"ms");
    }
    //反射方式调用
    public static void test02() throws Exception {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);
        Long starTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("反射方式调用:"+(endTime-starTime)+"ms");
    }
    //反射方式调用，关闭安全检测
    public static void test03() throws Exception{
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);
        Long starTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("关闭安全检测:"+(endTime-starTime)+"ms");
    }

    public static void main(String[] args) throws Exception {
        test01();
        test02();
        test03();
    }
}
