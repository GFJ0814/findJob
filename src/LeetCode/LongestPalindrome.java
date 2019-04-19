package LeetCode;

/**
 * @program: findJob
 * @description: 5.最长回文子串
 * @author: guofangjun001
 * @create: 2019-02-20 10:34
 **/
public class LongestPalindrome {


    /*
    给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

        示例 1：

        输入: "babad"
        输出: "bab"
        注意: "aba" 也是一个有效答案。
        示例 2：

        输入: "cbbd"
        输出: "bb"
     */
    public String longestPalindrome(String s) {
        String result = null;
        char[] chars = s.toCharArray();
        if(chars.length == 1 || chars.length == 0){
            return s;
        }
        int max = 0;
        int low = 0;
        int high = 0;

        for(int i = 0; i<chars.length-1;i++){

            for(int j=i+1;j<chars.length;j++){

                int k = i;
                int h = j;
                while(k<h){
                    if(chars[k] != chars[h]) break;
                    k++;
                    h--;
                }
                if(k>=h && max<=j-i+1){
                    max = j-i+1;
                    low = i;
                    high = j;
                }
            }
        }
        if(low >= 0 || high >=0){
            result = new String(chars,low,high-low+1);
        }
        return result;
    }

    public static void main(String[] args) {
        String test = "";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(test));
    }


}
