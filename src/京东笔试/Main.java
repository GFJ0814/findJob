package 京东笔试;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/5.
 */
public class Main {
    public static  void  main(String[] args){
        Scanner read=new Scanner(System.in);
        while(read.hasNext()){
            int m=read.nextInt();
            int n=read.nextInt();//记录行数
            int[][] record=new int[n][2];
            for(int i=0;i<n;i++){
                record[i][0]=read.nextInt();
                record[i][1]=read.nextInt();
            }
        }

    }

}
