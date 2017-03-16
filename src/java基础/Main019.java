package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/23.
 */
public class Main019 {
    public static void getReverseString(String input){
        String[] strs=input.split(" ");
        String[] newStr=new String[strs.length];
        int k=0;
        for(int i=strs.length-1;i>=0;i--){
            newStr[k++]=strs[i];
        }
        for(String str:newStr){
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String input=sc.nextLine();
            getReverseString(input);
        }
    }

}
