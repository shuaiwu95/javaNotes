package 数组;

import java.util.Arrays;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/21 0021
 * @Description: 数组
 * @Version: 1.0
 */
public class 稀疏数组的定义和转化 {
    public static void main(String[] args) {
        /*
        0	0	0	0	0	0	0	0	0	0
        0	0	1	0	0	0	0	0	0	0
        0	0	2	0	0	0	0	0	0	0
        0	2	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        0	0	0	0	0	0	0	0	0	0
        */
        // 假如，我们要用一个二维数组来记录一个棋盘，用 0 来记录棋盘的每一个位置，1记录黑子，2记录白子
        // 我们可以想象一下。。。棋盘刚开局的时候，我们的二维数组会有很多的 0 ，是不是感觉记录这么庞大的二维数据，浪费了空间
        // 所以，我们引出了一个概念 -- “稀疏数组”
        // 我们采用一种压缩的数组来保存非0元素的数组
        // 我们可以这样记录：
        /*
        *  行              列               元素值
        *  10（棋盘有10行）  10（棋盘有10列）   2（非0元素有2个）
        *  1               2               1  ----------------------第一行第二列元素为1 （黑子）
        *  3               1               2  ----------------------第三行第一列元素为2 （白子）
        * */
        // 综上所述，我们可以采用 (n + 1)行 * 3列 的数组来压缩二维数组 其中 n 代表非零元素的个数
        // 第一行用来存储总行数、总列数、非零元素的个数
        // 接下来存储元素的行数、列数和自身元素值

        int[][] arr = new int[10][10];
        arr[1][2] = 1;
        arr[3][1] = 2;
        arr[2][2] = 2;
        for (int[] ints: arr) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        int[][] result = toSparse(arr);
        System.out.println("输出稀疏数组：");
        for (int[] ints: result) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        /*
        10	10	3
        1	2	1
        2	2	2
        3	1	2
        */
    }

    // 把二维数组 转化为 稀疏数组
    public static  int[][] toSparse(int[][] arr) {
        // 求取非零元素的总个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count ++;
                }
            }
        }
        // (n + 1)行 * 3列 的数组
        int[][] result = new int[count + 1][3];
        result[0][0] = arr.length;
        result[0][1] = arr[0].length;
        result[0][2] = count;
        // 先遍历数组，找到所有非零元素 存储到数组结果中来
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    index ++;
                    result[index][0] = i;
                    result[index][1] = j;
                    result[index][2] = arr[i][j];
                }
            }
        }
        return result;
    }
}
