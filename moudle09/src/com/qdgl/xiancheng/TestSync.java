package com.qdgl.xiancheng;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/30 0030
 * @Description: com.qdgl.xiancheng 线程同步 当两个线程同时执行时，先执行的线程会锁定资源不允许其它线程动用
 * @Version: 1.0
 */
public class TestSync implements Runnable {
    Timer timer = new Timer();
    public static void main(String[] args) {
        TestSync test = new TestSync();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
    public void run () {
        // 添加当前线程的名字
        // 两个线程访问同一个对象的Add方法
        timer.add(Thread.currentThread().getName());
    }
}

class Timer {
    private static int num = 0;
    public void add (String name) {
        synchronized (this) { // 锁定当前对象， 成员变量也会被锁定，就不会出现其它线程打断
            /*
            * 上锁表示该对象在任一时刻只能由一个线程访问
            * */
            num ++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "，你是第：" + num + "个使用该线程");
        }
    }

    // 写法2
    /*public synchronized void add(String name) {
        num ++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "，你是第：" + num + "个使用该线程");
    }*/
}