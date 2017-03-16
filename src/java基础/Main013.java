package java基础;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/21.
 */
public class Main013 {
    /*
     给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
     大致思路:
        1.对于每一个输入的正整数将其转换为字符串
        2.将字符串转换为字符数组,根据去掉数字的个数取子串
        3.将子串转换为大数类逐个进行比较大小，取最大值
      */
    public static String getResult(String input,int n){
        String result="";

        return result;
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            BigInteger inputInt= cin.nextBigInteger();
            int n=cin.nextInt();
            String input=String.valueOf(inputInt);
            System.out.println(getResult(input,n));
        }
    }
}
