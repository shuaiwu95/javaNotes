package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test2
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // new 就是调用类的构造函数Person，如果没有定义构造函数，系统会自动分配一个
        // 我们也可以显示的编写一个构造器
        // 构造器格式：
        /*
        * 【修饰符】 构造器名字 （） {}
        * 1. 构造器没有返回值类型
        * 2. 方法体内部没有return
        * 3. 构造器名字必须和类名一样
        *
        * 构造器不是为了创建对象，进入构造器前对象已经创建好了，且属性已有默认值。
        * 构造器的目的是给属性赋值操作，但是一般不建议赋值
        * 我们建议必须加上空构造器
        * 如果没有写空构造器，你去重载构造器，会出错
        * */
        Person p = new Person("莉莉", 19, 160);
        System.out.println(p.name);
    }
}
