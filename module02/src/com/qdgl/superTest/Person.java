package com.qdgl.superTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.superTest
 * @Version: 1.0
 */
public class Person {
    int age;
    String name;
    public Person () {}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
