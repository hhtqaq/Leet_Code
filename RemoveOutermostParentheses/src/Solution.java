import java.util.Stack;

/**
 * 去掉最外层括号
 *
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+
 *  代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），
 * 其中 A 和 B 都是非空有效括号字符串。
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，
 * 其中 P_i 是有效括号字符串原语。
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * <p>
 * 示例 1：
 * <p>
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
 *
 * @author hht
 * @date 2019/8/14 11:00
 */
public class Solution {
    public static String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
       StringBuilder res=new StringBuilder();
        int key = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (')' == c) {
                stack.pop();
                if (stack.size() == 0) {
                    res.append(S.substring(key + 1, i));
                    key = i + 1;
                }
            } else {
                stack.push(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
