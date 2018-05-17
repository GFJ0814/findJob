package java基础;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/21.
 */
public class Main017 {
    private static LinkedList<Character> list=new LinkedList<Character>();
    public static  void  printResult(int k){
        int countA=0;
        int countB=0;
        list.add('A');
        for(int i=0;i<k;i++){
            list=getResult(list);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            if(list.get(i)=='A'){
                countA++;
            }else{
                countB++;
            }
        }
        System.out.println(countA+" "+countB);
    }
    public static LinkedList getResult(LinkedList<Character> list){
        //定义用于返回变化后的结果的字符串
        for(int i=0;i<list.size();i++){
            if(list.get(i)=='A'){
                list.set(i,'B');
            }
            if(list.get(i)=='B'){
                list.add(i+1,'A');
            }
        }
        return list;
    }


    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          while (sc.hasNext()){
              int k=sc.nextInt();
              printResult(k);
          }
    }
}
