package com.qdgl.xiancheng;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/31 0031
 * @Description: com.qdgl.xiancheng 生产者消费者问题
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        LanZiSyncStack ss = new LanZiSyncStack();
        Producer p = new Producer(ss);
        Consumer c1 = new Consumer(ss);
        Consumer c2 = new Consumer(ss);
        Thread tp = new Thread(p);
        Thread tc1 = new Thread(c1);
        Thread tc2 = new Thread(c2);
        tp.start();
        tc1.start();
        tc2.start();
    }
}

class WoTou {
    int id;
    WoTou (int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WoTou：" + id;
    }
}

/*
* 模拟篮子
* 是一个后进先出的栈
* */
class LanZiSyncStack {
    int index = 0; // 栈顶指针
    WoTou[] arrWT = new WoTou[6];

    /*
    * 篮子中投入窝头
    * */
    public synchronized void push (WoTou wt) {
        while (index == arrWT.length) {
            try {
                this.wait(); // 篮子满了，要停止投放窝头(锁定在当前对象的线程停止)，该方法在锁住的时候才能使用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 篮子内的窝头没了，总要继续投入窝头。窝头有了，总要取出窝头。所以需要随时唤醒被停止的线程
        this.notifyAll(); // 叫醒正在沉睡的线程
        arrWT[index] = wt;
        index ++;
    }

    /*
    * 取出窝头
    * */
    public synchronized WoTou pop () {
        while (index == 0) {
            try {
                this.wait(); // 窝头被取光了，要停止取出窝头(锁定在当前对象的线程停止)，该方法在锁住的时候才能使用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 篮子内的窝头没了，总要继续投入窝头。窝头有了，总要取出窝头。所以需要随时唤醒被停止的线程
        this.notifyAll(); // 叫醒正在沉睡的线程
        index --;
        return arrWT[index];
    }
}

/*
* 模拟生产者
* */
class Producer implements Runnable {
    LanZiSyncStack ss = null;
    Producer (LanZiSyncStack ss) {
        this.ss = ss;
    }
    @Override
    public void run () {
        for (int i = 0; i < 20; i++) {
            WoTou wt = new WoTou(i);
            ss.push(wt);
            System.out.println("生产了：" + wt);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
* 模拟消费者
* */
class Consumer implements Runnable {
    LanZiSyncStack ss = null;
    public Consumer(LanZiSyncStack ss) {
        this.ss = ss;
    }

    @Override
    public void run () {
        for (int i = 0; i < 20; i++) {
            WoTou wt = ss.pop();
            System.out.println("消费了：" + wt);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
