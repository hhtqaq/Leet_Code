import java.util.HashMap;
import java.util.HashSet;

/**
 * 宝石与石头
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 * @author hht
 * @date 2019/8/12 9:59
 */
public class Solution {
    public static int numJewelsInStones(String J, String S) {
        int count=0;
        HashMap<Character,String> map=new HashMap();
        char[] chars = J.toCharArray();
        char[] chars2 = S.toCharArray();
        for (char ch:chars){
             map.put(ch, null);
        }
        for (char ch:chars2){
            if(map.containsKey(ch)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
