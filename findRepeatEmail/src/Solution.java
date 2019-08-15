/**
 * 查找重复的电子邮件
 * 编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
 * @author hht
 * @date 2019/8/13 20:16
 */
public class Solution {
    /**# Write your MySQL query statement below
     * 1
     * select email from person group by email having count(id)>1;
     *
     * 2
     * select email from person group by email having count(*)>1;
     * count(*)更快，会省略判断是否为空的操作
     */
}
