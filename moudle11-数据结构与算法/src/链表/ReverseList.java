package 链表;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/25 0025
 * @Description: 链表
 * @Version: 1.0
 */
public class ReverseList {
    // 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
    /*输入: 1->2->3->4->5->NULL
    输出: 5->4->3->2->1->NULL*/
    // 思路，记录前置节点并变更指向
    // 我们需要 记录 当前节点 前置节点 临时节点（解决下一个节点指向丢失的问题）
    public static ListNode reverseList(ListNode head) {
        // 记录前置节点和当前节点
        ListNode pre = null;
        ListNode cur = head;
        // 移动遍历cur
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = ListNode.arrayToListNode(arr);
        ListNode reverseList = reverseList(head);
        System.out.println();
    }
}
