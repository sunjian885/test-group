package com.sunjian.reflection;

public class TestDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射机制，获取类的class对象
        Class c1 = Class.forName("com.sunjian.reflection.User");
        String name = c1.getName();
        //一个类在内存中只有一个class对象
        //一个类被加载后，整个对象都会被封装在class对象中
        Class c2 = Class.forName("com.sunjian.reflection.User");
        Class c3 = Class.forName("com.sunjian.reflection.User");
        Class c4 = Class.forName("com.sunjian.reflection.User");
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}

class User{
    private String name;
    private String gender;
    private int age;

    public User() {
    }

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}