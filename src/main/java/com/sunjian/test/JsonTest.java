package com.sunjian.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
    public static void main(String[] args) throws Exception {
        String jsonString = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(jsonString,Person.class);
        System.out.println(person.getName()+"+++++++++++");
        System.out.println(person.getAge()+"+++++++++++");
        System.out.println(person.getCity()+"+++++++++++");
    }
}

class Person{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
