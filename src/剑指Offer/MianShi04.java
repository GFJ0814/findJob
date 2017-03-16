package 剑指Offer;

import java.util.Scanner;

/**
 * Created by acer on 2016/8/26.
 */
public class MianShi04 {

    //1.将字符串中的空格替换成%20
    public static String relpaceSpace(String test){
        String result="";
        int spaceNum=0;
        if(test!=null){
            char[] testChar=test.toCharArray();
            for(char c:testChar){
                if(c==' '){
                    spaceNum++;//计算一共有多少个空格
                }
            }
            int newLength=test.length()+spaceNum*2;//新的数组所需要的容量大小
            char[] newTest=new char[newLength];
            int i=0;
            int j=0;
            while(j<testChar.length){
               if(String.valueOf(testChar[j]).equals(" ")){
                   newTest[i++]='%';
                   newTest[i++]='2';
                   newTest[i++]='0';
               }else{
                   newTest[i++]=testChar[j];
               }
                j++;
            }
            for(char c:newTest){
                result+=c;
            }

        }
        return result;

    }
    public String replaceSpace(StringBuffer str) {
        //1.计算有多少空格，
        char[] change="%20".toCharArray();
        String s=str.toString();
        int size=s.length();
        int spaceNum=0;
        char[] words=s.toCharArray();
        for(int i=0;i<words.length;i++){
            if(words[i]==' '){
                spaceNum++;
            }
        }
        //2.创建一个新数组,新的数组的容量是原来的数组长度+空格个数*2
        char[] newWords=new char[size+spaceNum*2];
        //3.从两个数组的最后一个开始,将原字符数组的字符添加到新字符数组中的最后一个位置
        int w=words.length-1;
        int n=newWords.length-1;
        while(w>=0){
            if(words[w]==' '){
                for(int i=change.length-1;i>=0;i--){
                    newWords[n]=change[i];
                    n--;
                }
            }else{
                newWords[n]=words[w];
                n--;
            }
            w--;
        }
        //4.将新生成的字符数组再拼成字符串

        String result="";
        for(char c:newWords){
            result+=c;
        }
        return result;
    }
    public String replaceSpace01(StringBuffer str) {
        String result="";
        int spaceNum=0;
        if(str!=null){
            char[] testChar=str.toString().toCharArray();
            for(char c:testChar){
                if(c==' '){
                    spaceNum++;//计算一共有多少个空格
                }
            }
            int newLength=testChar.length+spaceNum*2;//新的数组所需要的容量大小
            char[] newTest=new char[newLength];
            int i=0;
            int j=0;
            while(j<testChar.length){
                if(String.valueOf(testChar[j]).equals(" ")){
                    newTest[i++]='%';
                    newTest[i++]='2';
                    newTest[i++]='0';
                }else{
                    newTest[i++]=testChar[j];
                }
                j++;
            }
            for(char c:newTest){
                result+=c;
            }

        }
        return result;


    }
    public static void main(String[] args) {
        //输入多组数据:
        System.out.println("请输入测试数据的组数");
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        for (int i = 0; i <num; i++) {
            String test=sc.nextLine();
            System.out.println("数据的测试结果是:"+relpaceSpace(test));
        }
//    }

}
