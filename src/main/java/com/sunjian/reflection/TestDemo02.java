package com.sunjian.reflection;

//测试class类的创建方式有哪些
public class TestDemo02 {
    public static void main(String[] args) throws Exception {
        Person person = new Student();
        System.out.println("这个人是："+person.getName());
        //方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        //方式二：通过forName获得
        Class c2 = Class.forName("com.sunjian.reflection.Person");
        System.out.println(c2.hashCode());
        //方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //
    }
}

class Person{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student() {
        this.setName("学生");
    }
}
class Teacher extends Person{
    public Teacher() {
        this.setName("老师");
    }
}
