import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 子域名访问计数
 * <p>
 * 一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，
 * 下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，
 * 也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
 * <p>
 * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，
 * 例如："9001 discuss.leetcode.com"。
 * <p>
 * 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，
 * 输出格式和输入格式相同，不限定先后顺序。
 * <p>
 * 注意事项：
 * <p>
 *  cpdomains 的长度小于 100。
 * 每个域名的长度小于100。
 * 每个域名地址包含一个或两个"."符号。
 * 输入中任意一个域名的访问次数都小于10000。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subdomain-visit-count
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/8/15 16:24
 */
public class Solution {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] s = cpdomains[i].split(" ");
            //获取次数
            String t1 = s[0];
            //获取域名
            String s1 = s[1];
            String[] split = s1.split("\\.");
            int length = split.length;
            list1.add(s1);
            //二级
            if(length == 2){
                String s2 = split[length - 1];
                list1.add(s2);
            }
            if (length == 3) {
                String s2 = split[length - 1];
                String s3 = split[length - 1]+"."+split[length - 1];
                list1.add(s2);
                list1.add(s3);
            }
            int t2 = Integer.parseInt(t1);
            for (int i1 = 0; i1 < list1.size(); i1++) {
                String s3 = list1.get(i1);
                Integer j = map.get(s3);
                if (j != null) {
                    map.put(s3, t2 + j);
                } else {
                    map.put(s3, t2);
                }
            }
        }
        map.forEach((k, v) -> list.add(v + " " + k));
        return list;
    }

    public static void main(String[] args) {
        String cpdomains[] = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(cpdomains).forEach(System.out::print);
    }
}
