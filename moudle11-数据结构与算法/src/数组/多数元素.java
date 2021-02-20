package 数组;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/20 0020
 * @Description: 数组
 * @Version: 1.0
 */
public class 多数元素 {
    public static void main(String[] args) {
        /*
        * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
            你可以假设数组是非空的，并且给定的数组总是存在多数元素。
            * 示例 1：
                输入：[3,2,3]
                输出：3
                示例 2：

                输入：[2,2,1,1,1,2,2]
                输出：2
        * */

        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement2(nums2));

        System.out.println(majorityElement3(nums2));
    }
    // 解法1 利用 map<元素，出现次数>来记录元素出现次数，超过 n/2 则为需要的元素
    public static int majorityElement(int[] nums) {
        // 利用容器 Map 记录元素出现个数
        Map<Integer, Integer> map = new HashMap<>();
        // 满足多数元素出现的条件
        int halfLen = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // 初始化当前元素出现次数为1
            int count = 1;
            if (map.containsKey(num)) {
                count = map.get(num);
                count ++;
            }
            // 判断是否为多数元素
            if (count > halfLen) {
                return num;
            }
            map.put(num, count);
        }
        return -1;
    }

    // 解法2 利用排序 我们会发现，中间的元素就是多数元素
    // [2, 2, 1, 1, 1, 2, 2] => [1, 1, 1, 2, 2, 2, 2]
    public static int majorityElement2(int[] nums) {
        // 排序
        Arrays.sort(nums);
        int halfLen = nums.length / 2;
        return nums[halfLen];
    }

    // 解法3 投票算法
    // [2, 2, 1, 1, 1, 2, 2] 我们可以将每一个元素当作一个“候选人”
    // 我们来遍历这个数组 我们将第一个元素“2”设置为第一个“候选人”，默认该元素出现了1次
    // 在遍历过程中，如果出现一次同该“候选人”相同的元素，那么该元素出现此时 +1，如果不同，则 -1
    // 如果当前“候选人”出现的次数为0时，那么就要更换候选人为下一次遍历的元素，继续做如上计算
    // 其实就是， 多数元素出现的次数一定大于其它所有元素出现次数的综合，所以经过加减计算后，剩余的一定就是多数元素
    public static int majorityElement3(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count ++;
            } else {
                count --;
            }
        }
        return candidate;
    }
}
