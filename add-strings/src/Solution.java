/**
 * @author hht
 * @date 2020/8/3 20:16
 */
public class Solution {
    /**
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        while (i > 0 || j > 0 || carry > 0) {
            int x = i > 0 ? num1.charAt(i - 1) - '0' : 0;
            int y = j > 0 ? num2.charAt(j - 1) - '0' : 0;
            int res = x + y + carry;
            builder.append(res % 10);
            carry = res / 10;
            i--;
            j--;
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1";
        int x = a.charAt(0);
        System.out.println(x);
        System.out.println(addStrings("123", "1287"));
    }
}
