package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.extendTest
 * @Version: 1.0
 */
public class Person {
    // 属性
    private int age;
    private String name;
    private double height;
    int id;

    // setter getter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 吃
    public void eat () {
        System.out.println("可以吃饭");
    }

    // 睡觉
    public void sleep () {
        System.out.println("可以睡觉");
    }
}
