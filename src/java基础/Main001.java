package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/10.
 */
public class Main001 {
    public static  String getResult(String all,String some1,String some2){
        String result="";
        String some=some1+some2;
        boolean flag=true;
        char[] alls=all.toCharArray();
        char[] somes=some.toCharArray();
        char[] csome1=some1.toCharArray();
        char[] csome2=some2.toCharArray();
        for(int i=0;i<somes.length;i++){
            if (!all.contains(somes[i]+"")) {
                return result = "invalid";
            }
            if(somes[i]!=somes[somes.length-1-i]){
                flag=false;
            }
            if(flag==false) {
                if (all.indexOf(csome1[0]) < all.indexOf(csome2[0])) {
                    return "forward";
                } else {
                    return "backward";
                }
            }else{
                return "both";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] input=new String[3];
            for(int i=0;i<3;i++){
                input[i]=sc.nextLine();
            }
            System.out.println(getResult(input[0],input[1],input[2]));
        }
    }
}
