package com.qdgl.suanfa;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/21 0021
 * @Description: com.qdgl.suanfa 获取字符串中大小写字母的个数
 * @Version: 1.0
 */
public class Da_xiao_xie {
    public static void main(String[] args) {
        /*
        * 简单算法练习：获取字符串中大小写字母的个数
        * 思路：
        *   方案1：遍历字符串，拿出每一个字符，用 ASCII 码大小做比较
        *   方案2：遍历字符串，获取每一个字符是否属于26个大小写字母
        * */

        // 方案1：
        String testStr = "ABCWEFAAadwqeADFFzf";
        int capitalizationNum = 0; // 大写字母计数
        int lowercaseNum = 0; // 小写字母技术
        for (int i = 0; i < testStr.length(); i++) {
            char testCharItem = testStr.charAt(i);
            if ( testCharItem >= 'a' && testCharItem <= 'z') {
                lowercaseNum ++;
            } else if (testCharItem >= 'A' && testCharItem <= 'Z') {
                capitalizationNum ++;
            }
        }
        System.out.println("大写字母个数：" + capitalizationNum + "," + "小写字母个数：" + lowercaseNum);
        // 大写字母个数：12,小写字母个数：7
    }
}
