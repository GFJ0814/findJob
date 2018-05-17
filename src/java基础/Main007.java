package java基础;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/17.
 */
public class Main007 {

    public static  String getResult(int n,int m){
        String result="";
        double sum=0;
        double temp=n;
        for (int i = 0; i <m; i++) {
            sum+=temp;
            temp=Math.sqrt(temp);
        }
        DecimalFormat df   = new DecimalFormat("######0.00");
        result=df.format(sum);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(getResult(n,m));
        }
    }
}
