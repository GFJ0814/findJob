package java基础;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/28.
 */
public class Main23 {
    //网吧计费:
    public static void  getResult(double input){
        DecimalFormat df = new DecimalFormat(".00");
        if(input<=3){
            System.out.println(df.format(5));
        }else{
            double fee=5+(input-3)*2;
            if(fee>50){
                System.out.println(df.format(50));
            }else{
                System.out.println(df.format(fee));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            getResult(sc.nextDouble());
        }
    }
}
