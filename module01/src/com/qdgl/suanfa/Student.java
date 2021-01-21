package com.qdgl.suanfa;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test 学生
 * @Version: 1.0
 */
public class Student {
    int c; // 成员变量
    public  void study () {
        int num = 10; // 局部变量，在方法中，局部变量必须要有初始化值
        {
            int a; // 局部变量，代码块中
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c); // 0  全局属性有默认值
    }
}
