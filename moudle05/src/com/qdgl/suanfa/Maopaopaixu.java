package com.qdgl.suanfa;

import java.util.Arrays;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/19 0019
 * @Description: com.qdgl.suanfa 练习 冒泡排序
 * @Version: 1.0
 */
public class Maopaopaixu {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {23, 25, 12, 7, 51};
        // 两两比较 交换位置，每一轮交换都会产生一个最小值
        // 第一轮比较4次 第二轮3次 第三轮 2次 第四轮 1次
        sortPop(arr);
        System.out.println(Arrays.toString(arr)); // [51, 25, 23, 12, 7]
    }

    public static void sortPop (int[] arr) {
        if (arr != null && arr.length != 0) {
            // 总轮数 数组长度 -1
            // 比较次数 数组的长度 - （数组下标 + 1）
            // 外层 轮数
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j + 1] > arr[j]) {
                        // 定义一个临时变量 交换两个数
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}
