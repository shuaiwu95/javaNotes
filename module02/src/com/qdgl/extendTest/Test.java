package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.extendTest
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSno(1001);
        s.setAge(18);
        s.setName("菲菲");
        s.setHeight(180.4);
        System.out.println("学生名字为:" + s.getName() + ",学生年纪为:" + s.getAge());
        s.study();
        s.eat();
        s.sleep();
    }
}
