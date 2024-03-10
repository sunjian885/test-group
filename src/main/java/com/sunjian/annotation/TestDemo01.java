package com.sunjian.annotation;

import java.lang.annotation.*;

public class TestDemo01 {
    @MyAnnotation(name = "孙健",age=18,id=10,schools = {"清华大学","北京大学"})
    public void test01(){}
    @MyAnnotation02("sun")
    public void test02(){}
}

//定义一个注解
//Target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示我们的注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否将我们的注解生成在JAVADoc中
@Documented
//Inherited 表示子类可以继承父类的注解
@Inherited
@interface MyAnnotation{
    //注解的参数：参数类型+参数名（）；
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，表示不存在
    String[] schools();
}

@Target(ElementType.METHOD)
@interface MyAnnotation02{
    //默认值为value，当为value时，使用方可以直接传参
    //不用声明赋值
    String value();
}
