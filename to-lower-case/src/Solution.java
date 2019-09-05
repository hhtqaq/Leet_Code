/**
 * 709. 转换成小写字母
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 *
 * @author hht
 * @date 2019/9/5 19:43
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        char[] st = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
            }
            st[i] = c;
        }
        return new String(st);
    }
}
