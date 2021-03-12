import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author hht
 * @date 2021/3/12 15:55
 */
public class Solution {


    public static void main(String[] args) {


        String str = "{{{{";

        System.out.println(getDepth(str));

    }

    public static int getDepth(String str) {
        // 奇数直接返回
        if ((str.length() & 1) != 0) {
            return 0;
        }
        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put('}', '{');
        characterMap.put(')', '(');
        characterMap.put(']', '[');
        int maxDepth = 0;
        int tempDepth = 0;
        for (char aChar : chars) {
            if (!characterMap.containsKey(aChar)) {
                stack.push(aChar);
            } else if (stack.isEmpty()) {
                return 0;
            } else {
                Character pop = stack.pop();
                if (characterMap.get(aChar).equals(pop)) {
                    tempDepth++;
                    //初始化
                    if (stack.isEmpty()) {
                        maxDepth = Math.max(maxDepth, tempDepth);
                        tempDepth = 0;
                    }
                }
            }
        }
        return maxDepth;
    }

}
