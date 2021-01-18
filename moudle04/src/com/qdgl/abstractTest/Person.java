package com.qdgl.abstractTest;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.abstractTest
 * @Version: 1.0
 */

// 一个类中如果有方法是抽象方法，那么这个类也要变成一个抽象类
// 为子类提供通用的模板，避免子类设计的随意性
// 抽象类也有构造器
// 抽象类不能被final修饰， 因为抽象类设计初衷就是为了给子类继承
// 抽象类不可以被实例化，但是子类不受影响
public abstract class Person {
    // 在一个类中，会有一类方法子类对该类方法很满意，无需修改直接使用
    // 在一个类中，会有一类方法子类对该类方法永远不满意满意，需修改直接使用
    public void eat () {
        System.out.println("一顿不吃饿得慌");
    }
    // 方法体去掉，被abstract修饰，就是抽象方法
    public abstract void say ();
}

// 抽象类可以被其他类继承
// 一个类继承抽象类，那么这个类可以变成抽象类
// 一般子类不加 abstract ，一般会让子类重写父类中的抽象方法
// 子类继承抽象类就得继承全部的抽象类
// 子类如果没有重写父类全部的抽象方法，那么子类也可以变成一个抽象类
class Student extends Person {
    @Override
    public void say() {
        System.out.println("全世界都说中国话");
    }
}

class Demo {
    public static void main(String[] args) {
        // Person p = new Person(); // 抽象类不可以被实例化
        Student s = new Student();
    }
}
