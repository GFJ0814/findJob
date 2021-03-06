package java基础;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/23.
 * 现在有一棵合法的二叉树，树的节点都是用数字表示，现在给定这棵树上所有的父子关系，求这棵树的高度
 输入
 输入的第一行表示节点的个数n（1<=n<=1000，节点的编号为0到n-1）组成，
 下面是n-1行，每行有两个整数，第一个数表示父节点的编号，第二个数表示子节点的编号
 输出
 输出树的高度，为一个整数

 样例输入
 5
 0 1
 0 2
 1 3
 1 4
 样例输出
 3

 */
public class Main020 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data1=sc.nextInt();
        int data2=sc.nextInt();
       while(data2<n-1){
            data1=sc.nextInt();
             data2=sc.nextInt();
            set.add(data1);
        }
        System.out.println(set.size()+1);
    }


}
