import java.util.ArrayList;

/**
 * 键盘行
 *
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * @author hht
 * @date 2019/8/14 11:11
 */
public class Solution {
    /**
     * 思路：因为固定大小的26个字母 建立对应的hash表结构  第一二三排的值为123
     * 通过取模运算每个字符都会有响应的存储位置  值为他所在的行数 如  a的ASCII为97  就可以表示为a[97%26]=2
     * 注意大小写即可
     *
     * @param words
     * @return
     */
    public static String[] findWords(String[] words) {
        int i = 0;
        int a[] = {2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3, 2, 3, 3, 2, 1, 2, 2};
        int length = words.length;
        String word = null;
        ArrayList<String> list = new ArrayList<>();
        for (; i < length; ) {
            word = words[i];
            char[] chars = word.toLowerCase().toCharArray();
            int j = 0;
            int l = chars.length;
            boolean f = true;
            int row = a[chars[j++] % 26];
            for (; j < l && f; j++) {
                if (a[chars[j] % 26] != row) {
                    f = false;
                }
            }
            if (f) {
                list.add(words[i]);
            }
            i++;
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "cccd", "Dad", "Peace"};
        String[] words = findWords(strings);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
