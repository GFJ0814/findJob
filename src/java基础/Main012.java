package java基础;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/19.
 */
public class Main012 {
    public static  void printResult(int m,int n){
        List<Integer> list=new ArrayList<Integer>();
        if(m<100&&m>999){
            return;
        }
        boolean flag=true;
        for (int i = m; i <=n; i++) {
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                list.add(i);
            }
        }
        if(list.size()==0){
            System.out.println("no");
            return;
        }
        for(int i=0;i<list.size()-1;i++){
           if(list.get(i)-list.get(i+1)==-2){
               System.out.print(list.get(i)+" "+list.get(i+1));
           }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            printResult(m,n);
        }
    }

}
