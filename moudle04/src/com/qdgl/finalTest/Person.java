package com.qdgl.finalTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.finalTest
 * @Version: 1.0
 */
public final class Person { // final 修饰类，代表没有子类， 该类不可以被继承
    final public void eat () { // final 修饰方法, 不可以被该类的子类重写
        System.out.println("我可以吃饭");
    }
}

/*class Student extends Person {
  *//*  @Override
    public void eat () {
        super.eat();
    }*//*
}*/
