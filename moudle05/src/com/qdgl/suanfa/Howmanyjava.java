package com.qdgl.suanfa;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/21 0021
 * @Description: com.qdgl.suanfa
 * @Version: 1.0
 */
public class Howmanyjava {
    public static void main(String[] args) {
        /*
        * 练习2：求字符串中出现了几次 "java" ?
        * */
        String str = "javagoodjavakopkpkjavakjjavkokjava";
        String[] arr = str.split("java");
        System.out.println("一共出现了" + arr.length + "次 \"java\"");
        // 一共出现了4次 "java"
    }
}
