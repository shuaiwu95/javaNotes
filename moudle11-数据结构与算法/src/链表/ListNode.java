package 链表;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/25 0025
 * @Description: 链表
 * @Version: 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    // 数组转化为链表
    public static ListNode arrayToListNode (int[] arr) {
        if (arr.length == 0) return null;
        // 生成链表的根节点
        ListNode root = new ListNode(arr[0]);
        // 记录上一个节点
        ListNode pre = root;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            // 创建连接关系 将前一个结点的NEXT设置为当前节点
            pre.next = node;
            // 更新pre为当前节点 下一个要处理的节点
            pre = node;
        }
        return root;
    }
}
