package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/12.
 */
public class Main005 {

    public static  String getResult(int x){
        String param=x+"";
        String reParam="";
        int index=-1;
        for (int i = param.length()-1; i >=0; i--) {
            if(param.charAt(param.length()-1)=='0'){
                if(param.charAt(i)!='0'){
                    index=param.length()-1-i;
                }
            }
                reParam+=param.charAt(i);
        }
        if(index!=-1){
            return reParam.substring(index-1);
        }
        return reParam;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int param1=sc.nextInt();
            int param2=sc.nextInt();
            if(param1>=1&&param1<=1000&&param2>=1&&param2<=1000){
                if(getResult(Integer.parseInt(getResult(param1)) + Integer.parseInt(getResult(param2)))!="")
                System.out.println(getResult(Integer.parseInt(getResult(param1)) + Integer.parseInt(getResult(param2))));
            }

        }
    }
}
