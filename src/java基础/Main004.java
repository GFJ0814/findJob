package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/12.
 * 定义两个大于2的偶数之间的距离，为这两个数之间质数的个数。
 * 从小到大输入n个大于2的偶数，输出所有数两两之间距离的总和（应该有n*(n-1)/2个距离，输出总和就好)。
 *
 *  输入
 *     第一行是输入偶数的个数，最小为2，最大可能到几万。之后每行为一个偶数，最小是4，最大可能是几百万，不重复的升序排列。
 *       3
         4
         6
         12

         6
 *
 *  输出:
 *     输入数据两两间距离的总和，这应该是一个不小于0的整数。
 *
 *
 *
 */
public class Main004 {
    public static int getSum(int[] input){
        int result=0;
        for (int i = 1; i < input.length; i++) {
            result+=input[i]-input[i-1];
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){


        }
    }

}
