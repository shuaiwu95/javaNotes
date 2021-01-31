package com.qdgl.xiancheng;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/30 0030
 * @Description: com.qdgl.xiancheng
 * @Version: 1.0
 */

/*
* 让出CPU一下让别的程序执行
* */
public class TestYield {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("t1");
        t1.setPriority(Thread.NORM_PRIORITY + 3); // 设置优先级 Thread.NORM_PRIORITY 默认优先级5
        ThreadTest t2 = new ThreadTest("t2");
        t1.start();
        t2.start();
    }
}

class ThreadTest extends Thread {
    ThreadTest (String s) { super(s); }
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("my number:" + getName());
            if (i == 5) {
                yield();
            }
        }
    }
}
