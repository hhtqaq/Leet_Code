import java.util.HashMap;
import java.util.LinkedList;

/**
 * 删除链表中的节点
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
     *
     * @param node
     */
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static void main(String[] args) {
        String str = " E-R图是直观表示概念模型的工具， 它有三个基本\n" +
                "成分：\n" +
                "（1） 矩形框， 表示实体类型（ 考虑问题的对象）。\n" +
                "（2） 菱形框， 表示联系类型（ 实体间的联系）。\n" +
                "（3） 椭圆形框， 表示实体的属性。";
        int a = 5, b = 1;
        //判断奇偶数
        if ((a & 1) == 1) {
            System.out.println("基数");
        } else {
            System.out.println("偶数");
        }
        //交换位置   可以省内存 减少了变量
        //原理： 任何一个数同自己异或都等于0    0和任何一个数异或都等于那个数
        // a^a=0  0^a=a
        a ^= b;
        System.out.println(a);
        b ^= a;
        System.out.println(b);
        a ^= b;
        System.out.println(a);

        System.out.println(a + "_" + b);
        //System.out.println(str.replace(" ", "").replace("\n", ""));
    }
}
