package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/17.
 */
public class Main009 {
   /* public static  int getMax(String s){
        if(s==null&&s==""){
            throw new RuntimeException();
        }
        int result=-1;
        String[] all01=s.split(",");
        int[]  all02=new int[all01.length];
        int k=0;
        for(String str:all01){
            if(str.toCharArray()[0]>=48&&str.toCharArray()[0]<=57){
                throw new RuntimeException("输入的数值必须为正整数");
            }
            all02[k++]=Integer.parseInt(str);
        }
        int max=0,min=0;
        for(int i=0;i<all02.length;i++){
            if(all02[i]>=all02[max]){
                max=i;
            }
            if(all02[i]<=all02[min]){
                min=i;
            }
        }
        return all02[max]-all02[min];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            System.out.println(getMax(s));
        }
    }*/

}
