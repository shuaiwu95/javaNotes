package 数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/19 0019
 * @Description: 数组
 * @Version: 1.0
 */
public class 数组中的重复数字 {
    public static void main(String[] args) {
        /*
        * 输入：
        * [2, 3, 1, 0, 2, 5, 3]
        * 输出 2或3
        * */
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber1(nums));
        System.out.println(findRepeatNumber2(nums));
        System.out.println(findRepeatNumber3(nums));
    }

    // 解法1 集合的解法：利用集合记录已遍历的数据，判断是否在集合中存在
    public static int findRepeatNumber1 (int[] nums) {
        Set<Integer> set = new HashSet<>();
        // 遍历数组
        for (int num : nums) {
            // 如果集合中包含num
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    // 解法2 先排序后查找
    public static int findRepeatNumber2 (int[] nums) {
        // 进行排序
        Arrays.sort(nums);
        // 循环 判断相邻元素是否相等来判断是否重复
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int lastNum = nums[i - 1];
            if (num == lastNum) {
                return num;
            }
        }
        return -1;
    }

    // 解法3 使用临时数组
    public static int findRepeatNumber3 (int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (temp[num] != 0) {
                return num;
            }
            temp[num] = 1;
        }
        return -1;
    }
}
