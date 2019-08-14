import java.util.HashMap;
import java.util.LinkedList;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 * @author hht
 * @date 2019/8/13 19:55
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 输入: head = [4,5,1,9], node = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
     */
    /**
     * 只是用下一个值覆盖当前的值
     * @param node
     */
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
