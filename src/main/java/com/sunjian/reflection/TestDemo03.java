package com.sunjian.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射，动态的创建对象
public class TestDemo03 {
    public static void main(String[] args) throws Exception{
        //获取class对象
        Class c1 = Class.forName("com.sunjian.reflection.User");

        //方法一：构造一个对象
        User user1 = (User)c1.newInstance();//本质：调用的无参构造器
        System.out.println(user1);
        user1.setName("hello world");
        System.out.println(user1.getName());

        //方法二：通过构造器创建对象
        Constructor Constructor = c1.getDeclaredConstructor(String.class, String.class, int.class);
        User user2 = (User) Constructor.newInstance("孙健", "男", 18);
        System.out.println(user2);
        System.out.println(user2.getAge());

        //通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke：激活的意思
        //（对象，方法的值）
        setName.invoke(user3,"invoke");
        System.out.println(user3.getName());

        //通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，需要关闭程序的安全检测，属性或方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user4,"field");
        System.out.println(user4.getName());

    }
}
