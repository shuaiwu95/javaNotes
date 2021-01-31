package com.qdgl.xiancheng;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/30 0030
 * @Description: com.qdgl.xiancheng
 * @Version: 1.0
 */

// 合并线程
public class Testjoin {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        t1.start();
        try {
            t1.join(); // 将该线程合并到主线程，子线程执行完毕后才可以接着执行主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i am main thread");
        }
    }
}

class MyThread extends Thread {
    // 为该线程传一个字符串的名字便于管理
    MyThread (String s) {
        super(s);
    }
    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("i am a" + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

        }
    }
}
