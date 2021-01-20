package com.qdgl.String和StringBuffer;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/20 0020
 * @Description: com.qdgl.String和StringBuffer
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello";
        System.out.println(s1 == s3); // true
        // 因为编译器会优化已存在的字符串，存在同一个内存中，所以会相等
        s1 = new String("hello");
        s2 = new String("hello");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        // 类内部已重写 equals 方法
    }
}
