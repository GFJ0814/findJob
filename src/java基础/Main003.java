package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/12.
 *求一个字符串的最大回文前缀长度。回文是指正反方向读起来都一样的字符串，比如“abcdcba”就是一个回文。
 *
 *输入： 一个文本文件，至少包含一个字节。每个字节是一个字符。最大长度可能有几十万字节。
 *     sogou
 *
 * 输出：最大回文前缀的长度。
 * 1
 */
public class Main003 {

    public static int getMax(String input){
        if(input==null){
            throw  new RuntimeException();
        }
        int result=-1;
        boolean flag=true;
        //1.先判断每一个子串是否回文，如果回文，返回其前缀的长度，然后取所有的最大值
        char[] inputs=input.toCharArray();
        for(int i=0;i<inputs.length;i++){
            for(int j=i+1;j<inputs.length;j++){
                int m=i;
                int n=j;
                while(m<n){
                    if(inputs[m]!=inputs[n]){
                        flag=false;
                        break;
                    }
                    flag=true;
                    m++;
                    n--;
                }
                if(flag==true){
                   result=i>result?i:result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String input=sc.next();
            System.out.println(getMax(input));
        }
    }


}
