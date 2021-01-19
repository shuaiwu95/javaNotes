package com.qdgl.interfaceTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/19 0019
 * @Description: com.qdgl.interfaceTest
 * @Version: 1.0
 */
/*
* 1. 类是类，接口是接口，是同一层次的概念
* 2. 接口中没有构造器
* 3. 声明用interface
* 4. JDK 1.8 之前：
*   （1）常量 固定修饰符 public static final
*   （2）抽象方法 public abstract
*    // 修饰符不写IDE也会帮忙自动补全
* 5. JDK 1.8 之后
*   （1）被public default 修饰的方法[default 修饰符必须要加上]
*   （2）静态方法 不可被重写 不涉及到重写（所有静态方法都不可被重写）
* */
public interface TestInterface {
    public static int NUM1 = 10;
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String ndame);

    public default void g () {

    }

    public static void h () {}
}

interface TestInterface02 {
    public static int NUM2 = 10;
    public abstract void d();
    public abstract void e(int num);
    public abstract int f(String name);
}

/*
* 5. 类实现接口
* 6. 一旦实现一个接口， 那么实现类就要实现全部抽象方法
* 7. JAVA可以多实现，类可以实现多个接口
* */
class Student implements TestInterface,TestInterface02 {
    @Override
    public void a() {
        g(); // 可直接调用非抽象方法
        TestInterface.super.g();
    }

    @Override
    public void b(int num) {

    }

    @Override
    public int c(String name) {
        return 0;
    }

    @Override
    public void d() {

    }

    @Override
    public void e(int num) {

    }

    @Override
    public int f(String name) {
        return 0;
    }

    @Override
    public void g () {

    }
}

class Test {
    public static void main(String[] args) {
        // 接口不能创建对象

        // 接口可以指向实现类
        TestInterface02 t = new Student();

        // 接口中常量如何访问
        System.out.println(TestInterface02.NUM2);
        System.out.println(Student.NUM2);
    }
}