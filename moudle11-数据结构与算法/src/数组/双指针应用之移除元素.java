package 数组;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/22 0022
 * @Description: 数组
 * @Version: 1.0
 */
public class 双指针应用之移除元素 {
    public static void main(String[] args) {
       /*
        给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
        输入：nums = [0,1,2,2,3,0,4,2], val = 2
        输出：5, nums = [0,1,4,0,3]
        */

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        System.out.println(removeElement(nums, 2));
        System.out.println(removeElement2(nums, 2));

    }
    // 思路： 使用额外的指针，记录要覆盖的索引的位置
    public static int removeElement(int[] nums, int val) {
        // 定义一个指针，记录要覆盖的索引位置
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }

    // 解法二
    // 思路：遍历数组，将需要删除的元素与最后一个元素互换位置并使之长度减一
    public static int removeElement2(int[] nums, int val) {
        // 记录有效数组长度
        int len = nums.length;
        // 定义一个指针
        int index = 0;
        while (true) {
            if (index >= len) return len;
            // 如果当前元素等于val
            if (nums[index] == val) {
                // 那么就让当前元素等于数组的最后一个元素
                nums[index] = nums[len - 1];
                len --;
                // 抵消掉index ++，继续比较当前元素是否等于val
                index --;
            }
            index ++;
        }
    }
}
