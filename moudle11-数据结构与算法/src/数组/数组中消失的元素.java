package 数组;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/19 0019
 * @Description: 数组
 * @Version: 1.0
 */
public class 数组中消失的元素 {
    public static void main(String[] args) {
        /*
        *   给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
            找到所有在 [1, n] 范围之间没有出现在数组中的数字。
            您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
            示例:
            输入:
            [4,3,2,7,8,2,3,1]
            输出:
            [5,6]
        * */
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers2(nums));
    }

    // 解法1 使用容器存储已出现的
    // 不重复 无序 Set
    // 重复 有序 List
    // 记录映射关系<元素， 出现次数> Map
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        // 使用Set存储已出现的数据
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    // 解法2 不使用额外空间
    // 利用索引记录已出现的数字
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
