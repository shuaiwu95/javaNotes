package com.qdgl.modifier;

import com.qdgl.modifier2.B;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.modifier
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.age3 = 10;
        a.age2 = 8;
        B b = new B();
        b.eat();
    }
}
