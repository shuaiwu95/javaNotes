package 链表;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/2/22 0022
 * @Description: 链表
 * @Version: 1.0
 */
public class ListNode1 {
    // 数据
    String data;
    // 下一个节点的引用
    ListNode1 next;

    public ListNode1(String data) {
        this.data = data;
    }

    // 数组转化为链表
    public static ListNode1 arrayToListNode (String[] arr) {
        if (arr.length == 0) return null;
        // 生成链表的根节点
        ListNode1 root = new ListNode1(arr[0]);
        // 记录上一个节点
        ListNode1 pre = root;
        for (int i = 1; i < arr.length; i++) {
            ListNode1 node = new ListNode1(arr[i]);
            // 创建连接关系 将前一个结点的NEXT设置为当前节点
            pre.next = node;
            // 更新pre为当前节点 下一个要处理的节点
            pre = node;
        }
        return root;
    }

    // 测试
    public static void main(String[] args) {
        String[] arr = {"庆余年", "人民的名义", "赘婿", "回到明朝当王爷", "将夜", "夜天子"};
        ListNode1 node = arrayToListNode(arr);
        System.out.println();
    }
}
