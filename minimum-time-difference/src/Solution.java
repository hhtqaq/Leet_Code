import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: ["23:59","00:00"]
 * 输出: 1
 * <p>
 * 备注:
 * <p>
 * 列表中时间数在 2~20000 之间。
 * 每个时间取值在 00:00~23:59 之间。
 * 在真实的面试中遇到过这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-time-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("23:59");
        lists.add("00:00");
        System.out.println(findMinDifference(lists));
    }

    public static int findMinDifference(List<String> timePoints) {
        int size = timePoints.size();
        int minutes[] = new int[size];
        //转换为分钟
        for (int i = 0; i < timePoints.size(); i++) {
            String[] times = timePoints.get(i).split(":");
            minutes[i] = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
        }
        //排序
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        //计算时间差值最小
        for (int i = 0; i < minutes.length - 1; i++) {
            int temp = minutes[i + 1] - minutes[i];
            if (min > temp) min = temp;
        }
        //计算开始和结尾的差值
        int x = minutes[0] + 1440 - minutes[size - 1];
        return x < min ? x : min;
    }
}