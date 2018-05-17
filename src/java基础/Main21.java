package java基础;
import java.util.*;
public class Main21{
    public static int getResult(int k){
        if(k==1||k==2){
            return 1;
        }
        return getResult(k-1)+getResult(k-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(getResult(k));
    }
}