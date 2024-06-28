/**
 * Description:给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
 *
 * 示例 1：
 *
 * 输入：s = "Hello"
 *
 * 输出："hello"
 *
 *
 *
 * 示例 2：
 *
 * 输入：s = "here"
 *
 * 输出："here"
 *
 *
 *
 * 示例 3：
 *
 * 输入：s = "LOVELY"
 *
 * 输出："lovely"
 * Date: 2024-06-25
 * Time: 21:37
 */





public class LowerLetter {
    public String toLowerCase(String s){
        StringBuilder stringBuilder = new StringBuilder();
        //1.遍历字符串中每个字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //2.判断字符是不是字母
            if (Character.isLetter(ch)){
                //3.是字母，大写转化成小写
                if(!Character.isLowerCase(ch)){
                    ch = (char)(ch+32);
                }
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
