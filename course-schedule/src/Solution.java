import java.util.HashSet;
import java.util.Set;

/**
 * @author hht
 * @date 2020/8/5 9:40
 */
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null) {
            return false;
        }
        int length = prerequisites.length;
        if (length < 1) {
            return false;
        }
        int x = prerequisites[0][0];
        int y = prerequisites[0][1];
        int num = 1;
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c =a;

        Set<Integer>  sets=new HashSet<>();
        System.out.println(sets.add(a));
        System.out.println(sets.add(b));
        System.out.println(sets.add(c));

    }
}
