package com.qdgl.String和StringBuffer;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.test01
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 具体的猫
//        Cat cat = new Cat();
        // 具体的小女孩
        Girl girl = new Girl();

//        girl.play(cat); // 我是小猫可以喵喵喵
//
//        Dog dog = new Dog();
//        girl.play(dog); // 我是小狗我可以汪汪汪


        // 这就是多态的用法,扩展性那是极好
       /* Cat cat = new Cat();
        Animate an = cat;*/
        Animate an = new Cat();
//        an.scratch(); // 只允许访问Animate本身的方法和属性
        girl.play(an);

        /*
        * 多态: 同一个方法调用,由于对象不同可以产生不同的行为
        *      为了提高代码的拓展性
        * 多态的三要素:
        *      1. 继承
        *      2. 子类对父类的方法重写
        *      3. 父类引用指向子类对象
        *
        *
        * 父类方法形参传入子类的对象,子类的不同表现得效果也不同,构成了多态
        *
        * 注意: 多态可以提高拓展性,但是不是最好, 反射最好(后续会说)
        * */

        // 变量转型
        int a = 12;
        double dd = (double)a;
        System.out.println(dd);

        // 将Animate转为Cat 为向下转型
        Cat cat2 = (Cat)an;

        // 简单的工厂模式
        Animate an2 = PetStore.getAnimate("狗");
    }
}
