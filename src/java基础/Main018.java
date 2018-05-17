package java基础;

import java.util.Scanner;

/**
 * Created by acer on 2016/9/21.
 */
public class Main018 {
    public static int getResult(int[] array,int m){
        int result=0;
        for(int i=1;i<array.length;i++){
            for(int j=i;j<array.length;i++){
                if(Integer.parseInt(xor(array[i]+"",array[j]+""))>m){
                    result++;
                }
            }
        }
        return result;
    }
    private static String xor(String strHex_X,String strHex_Y){
        //将x、y转成二进制形式
        String anotherBinary=Integer.toBinaryString(Integer.valueOf(strHex_X,16));
        String thisBinary=Integer.toBinaryString(Integer.valueOf(strHex_Y,16));
        String result = "";
        //判断是否为8位二进制，否则左补零
        if(anotherBinary.length() != 8){
            for (int i = anotherBinary.length(); i <8; i++) {
                anotherBinary = "0"+anotherBinary;
            }
        }
        if(thisBinary.length() != 8){
            for (int i = thisBinary.length(); i <8; i++) {
                thisBinary = "0"+thisBinary;
            }
        }
        //异或运算
        for(int i=0;i<anotherBinary.length();i++){
            //如果相同位置数相同，则补0，否则补1
            if(thisBinary.charAt(i)==anotherBinary.charAt(i))
                result+="0";
            else{
                result+="1";
            }
        }
        //Log.e("code",result);
        return Integer.toHexString(Integer.parseInt(result, 2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String n=sc.next();
            int[] array=new int[Integer.parseInt(n)];
            String m=sc.next();
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            System.out.println(getResult(array,Integer.parseInt(m)));
        }
    }
}
