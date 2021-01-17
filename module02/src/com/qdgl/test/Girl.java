package com.qdgl.test;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.test
 * @Version: 1.0
 */
public class Girl {
    /*
    * 小知识: alt + insert 可自动生成 set get方法
    * */
    private int age; // 设置私有变量
    private  int sno;
    private String name;
    private double weight;
    private String sex;

    /* 构造函数 */
    public Girl () {}

    public Girl(int age, int sno, String name, double weight, String sex) {
        this.age = age;
        this.sno = sno;
        this.name = name;
        this.weight = weight;
        this.setSex(sex);
    }



    /*
    * 读取年龄
    * */
    public int getAge () {
        return this.age;
    }

    /*
    * 设置年龄
    * */
    public void setAge (int age) {
        if (age >= 30) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex) ) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }
}
