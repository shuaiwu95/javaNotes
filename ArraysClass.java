import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // Arrays工具类
        int[] arr = {1, 3, 7, 2, 4, 8};
        // toString 对数组遍历查看，返回字符串
        System.out.println(Arrays.toString(arr));

        //binarySearch 二分法查找 找出指定数组中的指定元素的索引
        // 必须是有序的数组
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3));


        int[] arr2 = {1, 3, 7, 2, 4, 8};
        // copyOf 完成数组的复制
        int[] newArr = Arrays.copyOf(arr2, 4);
        System.out.println(Arrays.toString(newArr));

        // copyOfRange 拷贝一段区间
        int[] newArr2 = Arrays.copyOfRange(arr2, 1, 4);
        System.out.println(Arrays.toString(newArr2));

        // equals 比较两个数组的值是否一样 返回布尔值

        // fill 数组的填充
        int[] arr3 = {1, 3, 7, 2, 4, 8};
        Arrays.fill(arr3, 10); // 所有数组元素都被填充为 10
        
    }
}