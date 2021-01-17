package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test2
 * @Version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;
    // 定义一个构造器
    // 构造器之前就创建好对象了
    // 构造器的作用是为了给属性赋值
    // 不建议在构造器中赋值 但是为了避免错误，必须写上空构造器
    public Person () {
//        age = 19;
//        name = "小明";
//        height = 169.5;
    }
    /*
    * 构造器重载
    * this修饰构造器必须放在第一行
    * */
    public Person (String name, int age, double height) {
        this(name, age);
        this.height = height;
    }
    public Person (String name, int age) {
        this(name);
        this.age = age;
    }
    public Person (String name) {
        this.name = name;
    }
    public void eat () {
        System.out.println("i like eat");
    }
}
