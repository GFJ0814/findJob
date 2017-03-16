package 有道笔试;

import java.util.Scanner;

/**
 * Created by acer on 2016/8/17.
 */
public class Main01 {
    public static void main(String[] args){
        //输入组数T(T<=100)
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t<=100){
            for(int i=0;i<t;i++){
                //第一行两个数n,k(1<=n,k<=100)
                String s=sc.next();
                String[] ss=s.split(" ");
                for(String sl:ss){
                    System.out.println(sl);
                }
                int n=Integer.parseInt(ss[0]);
                int k=Integer.parseInt(ss[1]);

                if((n>=1&&n<=100)&&(k>=1&&k<=100)){
                    //给数组赋值
                    int[] cardArray=new int[2*n];
                    String el=sc.next();
                    String[] els=el.split(" ");
                    if(els.length==2*n){
                        for(int j=0;j<2*n;j++ ){
                           if(Integer.parseInt(els[i])>=1&&Integer.parseInt(els[i])<=1000000000){
                                cardArray[i]=Integer.parseInt(els[i]);
                           }else{
                               return;
                           }
                        }
                    }
                    int[] temp=new int[2*n];
                    for(int m=0;m<k;m++){
                        for(int me=0;me<n;me++){
                            temp[2*me]=cardArray[me];
                            temp[2*me+1]=cardArray[me+n];
                        }
                        cardArray=temp;
                    }
                    for(int ele:cardArray){
                        System.out.print(ele+"  ");
                    }
                }
            }
        }

    }
}
