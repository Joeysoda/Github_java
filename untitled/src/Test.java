/**
 * Description:
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 *
 *
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: 0
 * 示例 2:
 *
 * 输入: s = "loveleetcode"
 * 输出: 2
 * 示例 3:
 *
 * 输入: s = "aabb"
 * 输出: -1
 *
 *
 * 提示:
 *
 * 1 <= s.length <= 105
 * s 只包含小写字母
 *
 * 步骤1：统计字符出现次数
 * 创建一个长度为26的整型数组 count，用于存储每个字符出现的次数。因为字符串 s 只包含小写字母 'a' 到 'z'，所以可以使用数组的索引来表示每个字符。
 * 遍历字符串 s，对于每个字符 ch，通过 ch - 'a' 计算字符在字母表中的位置，然后将 count 数组中对应位置的值加1。
 * 步骤2：查找第一个不重复的字符
 * 再次遍历字符串 s，对于每个字符 ch，检查 count[ch - 'a'] 的值是否为1。如果找到这样的字符，返回其索引。
 * 如果遍历完整个字符串没有找到出现次数为1的字符，返回 -1。
 * Date: 2024-06-26
 * Time: 21:28
 */
public class Test {

        public int firstUniqChar(String s) {
            int[] count = new int[26];  // 用于存储每个字符出现的次数
            // 统计每个字符出现的次数
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                count[ch - 'a']++;  // 计算字符在字母表中的位置
            }
            // 找到第一个出现次数为1的字符，并返回它的索引
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (count[ch - 'a'] == 1) {
                    return i;
                }
            }
            // 如果不存在不重复的字符，则返回-1
            return -1;
        }
    }




