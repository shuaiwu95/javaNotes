package com.qdgl.modifier2;

import com.qdgl.modifier.A;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.modifier2
 * @Version: 1.0
 */
public class B extends A {
    public void a () {
        System.out.println(age3);
        eat();
    }

    // 重写父类的方法 必须严格和父类方法保持一致 但是修饰符,返回值类型可以不保持一致  父类的返回值类型大于子类 父类的权限修饰符要低于子类的
    @Override
    public void eat () {
        System.out.println("吃小龙虾喝啤酒");
    }
}
