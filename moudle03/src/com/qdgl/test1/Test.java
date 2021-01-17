package com.qdgl.test1;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/17 0017
 * @Description: com.qdgl.test1
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student("feifei", 22, 160);
        System.out.println(s); // com.qdgl.test1.Student@677327b6
        System.out.println(s.toString()); // com.qdgl.test1.Student@677327b6
        /*
        * Object 类的 toString 方法返回该对象的字符串类型
        * "com.qdgl.test1.Student": 全限定路径 包名+类名完整表示
        * "677327b6": hasCode() --> 将对象在堆中的地址,进行哈希算法,返回一个码 --> 将此码传入 nteger.toHexString(哈希码)中,
        * 返回一个十六进制的字符串
        * */
    }
}
