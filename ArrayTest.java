import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // 录入十个人的成绩，求和
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // for(int i = 1; i <= 10; i ++) {
        //     System.out.println("请输入第" + i +"个小学生的成绩");
        //     int score = sc.nextInt();
        //     sum += score;
        //     if (i == 10) {
        //         sc.close();
        //         break;
        //     }
        // }
        // System.out.println("是个学生成绩和为" + sum);

        // 定义一个int类型的数组
        int[] arr = new int[4]; // 开辟空间为4的数组
        arr[0] = 12;
        arr[1] = 10;
        arr[2] = 8;
        arr[3] = 4;
        System.out.println(arr[3]);

        // 增强for循环
        for (int item:arr) {
            System.out.println(item);
        }

        // 静态初始化
        int[] arr2 = {12, 23, 45};

        // 默认初始化
        int[] arr3 = new int[3]; // 有默认初始化的值，例如 int类型就是 0,0,0


        // [1] 求数组中的最大值
        int[] arr4 = {45, 35, 88, 65, 20};
        System.out.println("当前数组中最大的为" + getMaxNum(arr4));

        // 数组的查询
        int[] arr5 = {3, 2, 1, 5, 6};
        // 1. 查询指定位置的元素

        // 2. 查询指定元素的位置
        int index = getArrIndex(arr5, 6);
        if (index != -1) {
            System.out.println("元素对应的索引为：" + index);
        } else {
            System.out.println("查无此数");
        }

        // 数组添加
        int[] arr6 = {1, 2, 3, 4, 5, 6};
        // 在下标为2的元素后边添一个数 99
        int insertIndex = 2;
        int insertNum = 99;
        for (int i = arr6.length - 1; i >= (insertIndex + 1); i--) {
            arr6[i] = arr6[i - 1];
        }
        arr6[insertIndex] = insertNum;
        System.out.print("新数组为：" + Arrays.toString(arr6));
    }

    /**
     * 求数组中的最大值
     * @param arr
     * @return
     */
    public static int getMaxNum (int[] arr) {
        int maxNum = arr[0];
        for (int item : arr) {
            if (item > maxNum) {
                maxNum = item;
            }
        }
        return maxNum;
    }
    /**
     * 查询数组指定元素的位置
     * @param arr
     * @param num
     * @return
     */
    public static int getArrIndex (int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (item == num) {
                index = i;
                break; // 如果只找头一个，就用break
            }
        }
        return index;
    }
}