package com.qdgl.extendTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.extendTest
 * @Version: 1.0
 */
public class Student extends Person { // 子类Student继承父类Person
    // 定义特有属性
    private int sno; // 学号

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
        super.eat(); // 可以用super.xxx表示父类的方法属性,通常可以省略不写
        // 但是,如果子类中有和父类相同的属性,如果想调用父类中的属性,就必须用super.xxx
    }

    // 学习
    public void study () {
        System.out.println("可以学习");
    }
}
