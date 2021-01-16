package com.test;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test 人类
 * @Version: 1.0
 */
public class Person {
    // 人类的名词
    int age; // 年龄
    String name; // 姓名
    double height; // 身高
    double weight; // 体重

    // 方法
    public void eat () {
        System.out.println("我喜欢吃饭");
    }
    // 睡觉
    public void sleep (String address) {
        System.out.println("我在" + address + "睡觉");
    }
    // 自我介绍
    public String introduce () {
        return "我的名字是" + name + ",我的年龄是" + age + ",我的身高是" + height + ",我的体重是" + weight;
    }
}
