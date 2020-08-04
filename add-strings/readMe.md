# 415. 字符串相加

给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

注意：

num1 和num2 的长度都小于 5100.
num1 和num2 都只包含数字 0-9.
num1 和num2 都不包含任何前导零。
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


     int x = i > 0 ? num1.charAt(i - 1) - '0' : 0;
     
     这是因为0的ascii码是48  字符相减的时候可以算出数值 而不是ascii的值
     eg：int x=“1”.charAt(0)   x=49
         int x=“1”.charAt(0)-'0' ==49-48=1
    