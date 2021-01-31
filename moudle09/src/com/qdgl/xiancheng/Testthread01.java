package com.qdgl.xiancheng;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/30 0030
 * @Description: com.qdgl.xiancheng
 * @Version: 1.0
 */

/*
* 线程的几个方法：
*   1. isAlive 线程是否还活着 阻塞 运行 就绪 都是活着
*   2. getPriority 获取线程的优先级数值
*   3. setPriority 设置线程的优先级
*   4. Thread.sleep 将当前线程睡眠指定的毫秒数
*   5. join 合并某线程
*   6. yield 让出CPU，让当前线程进入就绪队列等待调度
*   7. wait 当前线程进入对象 wait pool
*   8. notify/notifyAll 唤醒对象的 wait pool中的 一个/所有 等待线程
* */
public class Testthread01 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
//        r.run();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread:" + i);
        }

        Runner2 r2 = new Runner2();
        r2.start();
    }
}

/*
* 实现一个接口实现线程类
* 推荐使用接口！！！！！
* */
class Runner1 implements Runnable {
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("runner1:" + i);
        }
    }
}

/*
* 继承一个线程实现
* */
class Runner2 extends Thread {
    public void run () {
        for (int i = 0; i < 100; i++) {
            System.out.println("runner2:" + i);
        }
    }
}
