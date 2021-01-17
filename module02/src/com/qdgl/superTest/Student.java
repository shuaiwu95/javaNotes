package com.qdgl.superTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.superTest
 * @Version: 1.0
 */
public class Student extends Person {
    double score;
    public Student () {
//        super(); // 调用父类的空构造器
    }
    public Student (int age, String name) {
        super(age, name);
    }
}
