/**
 * @author hht
 * @date 2020/7/31 17:34
 */
public class Solution {
    /**
     * 验证字符串
     *
     * @param word 待验证的字符串
     * @param abbr 缩略串
     * @return true or false
     */
    public static boolean valid(String word, String abbr) {

        //计算abbr换成字符的大小
        char[] wordChars = word.toCharArray();
        char[] abbrChars = abbr.toCharArray();
        int i = 0, j = 0;
        while (i < wordChars.length && j < abbrChars.length) {
            //若abbr中包含非前导0的数字 ascii  a-z:  97-122
            //如果是数字
            if (abbrChars[j] < 97 && abbrChars[j] != '0') {
                int num = 0;
                int cnt = 1;
                while (j < abbrChars.length && abbrChars[j] < 97) {
                    num = cnt * num + abbrChars[j] - '0';
                    cnt = 10 * cnt;
                    j++;
                }
                i += num;
            } else {  //否则直接按位判断字符
                if (wordChars[i] != abbrChars[j])
                    return false;
                i++;
                j++;
            }
        }

        if (i == wordChars.length && j == abbrChars.length)
            return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(valid("internationalization", "i12iz4n"));
    }
}
