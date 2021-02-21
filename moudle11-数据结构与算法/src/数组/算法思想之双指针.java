package 数组;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/21 0021
 * @Description: 数组
 * @Version: 1.0
 */
public class 算法思想之双指针 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
        }
        // 当我们遍历一个数组时
        // 索引 i 被称作 指针 或者 引用
        // 如果，我们从数组的两头开始遍历，直到两个指针“相遇”，我们称这种思想为“双指针”，也可以称之为“对撞指针”
        // 如果两个指针相同方向，但是指针速度不同或者起点不同，我们称之为“快慢指针”

        // 案例：
        /*给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
        不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成*/

        /*给定 nums = [0,0,1,1,1,2,2,3,3,4],
        函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
        你不需要考虑数组中超出新长度后面的元素。*/

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        // 记录要比较元素的位置
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != nums[index]) {
                index ++;
                nums[index] = num;
            }
        }
        return index + 1;
    }
}
