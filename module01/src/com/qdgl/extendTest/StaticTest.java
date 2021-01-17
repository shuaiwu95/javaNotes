package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test2
 * @Version: 1.0
 */
public class StaticTest {
    /*
    * static 可以修饰： 属性 方法 代码块 内部类
    * static 修饰属性：
    *   静态变量 存于静态域中
    *   先于对象存在
    *   被该类的所有对象共享
    *   官方推荐访问方式，直接通过类名访问 StaticTest.sId
    *   static 应用场景：某些特定数据需要在内存中共享
    *   static 修饰的属性为 类属性
    *
    * static 修饰方法：
    * 在静态方法中不能访问非静态的属性 也不能调用非静态的方法 因为static先于对象存在
    * 静态方法可以用静态名.方法名调用,也可以用类名.方法名调用,推荐用 类名.方法名调用
    * 小知识点: 在同一个类中可以直接调用
    *
    * */
    int id;
    static int sId;

    public void a () {
        System.out.println("aaaaaaaaa");
        System.out.println(id);
        System.out.println(sId);
    }
    public static void b () {
        System.out.println("bbbbbbbbbbb");
//        System.out.println(id); // 报错
        System.out.println(sId);
    }

    public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        t1.id = 10;
        t1.sId = 10;

        StaticTest t2 = new StaticTest();
        t2.id = 20;
        t2.sId = 20;

        StaticTest t3 = new StaticTest();
        t3.id = 30;
        t3.sId = 30;

        // 官方推荐方式
        StaticTest.sId = 8888;
        int staticSid = StaticTest.sId;

        StaticTest.b();
        b(); // main方法在同一个类中可以直接调用

        System.out.println(t1.id); // 10
        System.out.println(t1.sId); // 30
        System.out.println("==================");
        System.out.println(t2.id); // 20
        System.out.println(t2.sId); // 30
        System.out.println("==================");
        System.out.println(t3.id); // 30
        System.out.println(t3.sId); // 30
        System.out.println("==================");
        System.out.println(staticSid);
    }
}
