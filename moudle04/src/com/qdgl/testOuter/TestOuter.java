package com.qdgl.testOuter;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/19 0019
 * @Description: com.qdgl.testOuter 内部类
 * @Version: 1.0
 */

/*
* 局部内部类 可以写在 方法内 块内 构造器内
* */
public class TestOuter {
    int age;
    class D {}
    // 静态成员内部类
    static class E {}
    public void a () {
        System.out.println("这是a方法");
        {
            System.out.println("这是普通快");
            class B {}
        }
        class A {}
    }
    static {
        System.out.println("这是静态块");
    }
    {
        System.out.println("这是构造块，构造块先于构造器执行");
    }
    public TestOuter() {
        class C {}
    }
    public TestOuter(int age) {
        this.age = age;
    }
}
