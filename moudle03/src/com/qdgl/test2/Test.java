package com.qdgl.test2;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.test2
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建phone
        Phone p1 = new Phone("华为P40", 2035.98, 2020);
        Phone p2 = new Phone("华为P40", 2035.98, 2020);
        // 比较两个对象
        // "==" 比较左右两侧的值是否相等
        // Object 提供 equals 方法,比较对象内容是否相等
        // 点进源码发现底层依旧是 "==" 比较,所以需要重写
        boolean flag = p1.equals(p2);
        System.out.println(flag);

        Cat c1 = new Cat();
        System.out.println(p1.equals(c1));
    }
}
