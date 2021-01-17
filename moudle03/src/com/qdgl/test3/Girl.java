package com.qdgl.test3;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.test3
 * @Version: 1.0
 */
public class Girl {
    String name;
    double weight;
    Mum m;

    public void love (Boy b) { // 参数是 引用数据类型
        System.out.println("我男朋友的名字:" + b.name);
        System.out.println("我男朋友的年龄:" + b.age);
        b.buy();
    }

    public void weChart () {
        m.say();
    }

    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
