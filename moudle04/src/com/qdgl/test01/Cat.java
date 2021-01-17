package com.qdgl.test01;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.test01
 * @Version: 1.0
 */
public class Cat extends Animate {
    @Override
    public void shout () {
        System.out.println("我是小猫可以喵喵喵");
    }

    public  void scratch () {
        System.out.println("我是小猫可以挠人!");
    }
}
