package com.qdgl.finalTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.finalTest
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // final 可以修饰 变量 方法 类

        // 修饰变量，变量不可改变，成为一个字符常量，名字约定大写
        final int A = 10; // 修饰基本数据类型

        // 修饰引用数据类型，地址值不可改变，但是不影响属性的改变
        final Dog dog = new Dog(); // final 修饰，地址值不可改变
        // dog = new Dog();

        // 这种情况final不会影响赋值
        final Dog dog2 = new Dog();
        a(dog2);

        // 这种情况就不能变了
        b(dog2);

        // final 修饰方法, 不可以被该类的子类重写

        // final 修饰类，代表没有子类， 该类不可以被继承

        // 给构造器私有化，该类就无法实例化了，例如 Math
    }

    public static void a(Dog d) {
        d = new Dog();
    }

    public static void b(final Dog d) {
//        d = new Dog();
    }
}
