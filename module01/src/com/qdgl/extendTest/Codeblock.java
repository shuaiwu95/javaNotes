package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test2 代码块
 * @Version: 1.0
 */
public class Codeblock {
    /*
    * 代码块的分类:
    * 普通块, 构造块, 静态块, 同步块(多线程中)
    * 执行顺序: 静态块 [构造块 普通块]
    * */
    int a;
    static int sa;
    public void a () {
        System.out.println("============a");
        // 普通块
        {
            // 限制了局部变量的作用范围
            int num = 10;
            System.out.println(num);
        }
    }
    public static void b () {
        System.out.println("=============b");
    }

    // 构造块
    {
        // 可以让我们在方法外写代码
        System.out.println("这是构造块");
    }

    // 静态块
    static {
        // 这里只能访问静态的属性和静态方法
        // 用途 用来加载一些全局配置信息
        System.out.println("这是静态块" + sa);
        b();
    }

    public Codeblock (int a) {
        this.a = a;
    }
}
