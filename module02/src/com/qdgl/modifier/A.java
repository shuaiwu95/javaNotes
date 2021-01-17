package com.qdgl.modifier;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.modifier 权限修饰符
 * @Version: 1.0
 */
public class A {
    private int age; // 只在同一个类中访问,不同类中不可直接访问
    int age2; // 缺省修饰符, 同一个类/同一个包下都可以直接访问
    protected int age3; // 在不同包下的子类中依然可以访问到
    public int age4; // 整个项目都可以访问
    /*
    * 总结:
    *   属性,方法: 修饰符4种 private default protected public
    *   类: 两种 default public
    *
    *   以后写代码
    *   属性 private
    *   方法 public
    * */
    public void eat () {
        System.out.println(age);
        age = 10;
    }
}
