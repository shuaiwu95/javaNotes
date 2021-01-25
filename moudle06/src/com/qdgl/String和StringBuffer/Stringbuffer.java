package com.qdgl.String和StringBuffer;

import java.util.Arrays;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/24 0024
 * @Description: com.qdgl.String和StringBuffer 可变的字符序列
 * @Version: 1.0
 */
public class Stringbuffer {
    public static void main(String[] args) {
        // StringBuffer
        String s1 = "hellow";
        String s2 = "world";
        StringBuffer s = new StringBuffer(s1);
        s.append(s2);
        System.out.println(s);
        // 基础数据类型包装类 将下边字符串解析为二维数组
        double[][] d; // 定义一个二维数组
        String ss = "1,2;3,4,5;6,7,8";
        // 将上边字符串解析为二维数组
        String[] sFirst = ss.split(";"); // 将字符串分隔为字符串数组
        d = new double[sFirst.length][];
        for (int i = 0; i < sFirst.length; i++) {
            String[] sSecond = sFirst[i].split(",");
            d[i] = new double[sSecond.length];
            for (int j = 0; j < sSecond.length; j++) {
                d[i][j] = Double.parseDouble(sSecond[j]);
            }
        }
    }
}
