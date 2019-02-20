package LeetCode;

/**
 * @program: findJob
 * @description: 3.无重复字符的最长子串
 * @author: guofangjun001
 * @create: 2019-02-19 10:43
 **/
public class Three {

    /*
    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
             请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

        /*
            思路：
                从每个字符串的第二个字符开始，用其对比之前的子串中，是否包含了该字符
                如果不包含，将该字符往后推一位，再去将它和之前的子串的每一位进行比较
                比如abcabcbb
                第一次 用b和a比较 不相等 最长子串长度=1
                第二次 用c和ab逐个比较 不相等 最长子串=2
                第三次 用a和abc逐个比较 出现重复 最长子串=3


         */

    public int lengthOfLongestSubstring(String s) {
        char[] chars  = s.toCharArray();
        if(chars.length==1){
            return 1;
        }
        int max =0 ;
        int index = 0;
        for(int i=1;i<chars.length;i++){
            int length = 0;
            for(int j = index;j<i;j++){
                if(chars[i]==chars[j]){
                    index++;
                    i--;
                    break;
                }
            }
            length = i-index+1;
            max = length>max? length:max;
        }
        return max;
    }


    public static void main(String[] args) {
        Three three = new Three();
        String test = " ";
        System.out.println(three.lengthOfLongestSubstring(test));
    }
}
