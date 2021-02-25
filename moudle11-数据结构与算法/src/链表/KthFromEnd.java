package 链表;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/25 0025
 * @Description: 链表
 * @Version: 1.0
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class KthFromEnd {
    /*
    * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。

    例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。


    示例：

    给定一个链表: 1->2->3->4->5, 和 k = 2.

    返回链表 4->5.
    * */

    // 思路
    // 先遍历出链表的总长度N，倒数第K个节点 就是从头遍历的第 N - K + 1 个节点
    public static ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        // 计算链表的长度
        while (temp.next != null) {
            n ++;
            temp = temp.next;
        }
        // 遍历链表
        temp = head;
        for (int i = 0; i < n - k + 1; i ++) {
            temp = temp.next;
        }
        return temp;
    }

    // 解法二
    // 利用双指针解法
    // 第一个指针在第一个的位置
    // 第二个指针先找到第K个节点
    // 然后两个指针同时移动
    // 当第二个指针到达尾部，那第一个指针恰好会到第K个节点
    public static ListNode getKthFromEnd2(ListNode head, int k) {
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // 测试
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode KthFromEndNode = getKthFromEnd(head, 3);
        ListNode KthFromEndNode2 = getKthFromEnd2(head, 3);
        System.out.println();
    }
}
