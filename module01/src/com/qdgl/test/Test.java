package com.qdgl.test;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.test 测试类入口
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个张三
        Person zs = new Person();
        zs.name = "张三";
        zs.age = 19;
        zs.height = 180.4;
        zs.weight = 170.4;
        System.out.println(zs.introduce());
    }
}
