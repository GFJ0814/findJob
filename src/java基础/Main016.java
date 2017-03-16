package java基础;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by acer on 2016/9/21.
 */
public class Main016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int input=sc.nextInt();
            findLast(input);
        }
    }

    /**
     * 最后出队的人
     * @param total  总的人数
     *
     */
    public static void findLast(int total){
        //定义一个数组，true表示没有出队列的，false表示已经出队列的
        boolean []arr = new boolean[total];
        Arrays.fill(arr, true);

        //移动变量，如：1  2  3  1  2  3  1  2
        int next = 1;

        //数组下标
        int index = 0;

        //剩下的人数
        int count = total;

        //如果剩下的人数为1人时，停止报数
        while(count>1){
            if(arr[index] == true){
                if(next == 3){
                    arr[index] = false;

                    //剩下的人数减1
                    --count;

                    //移动变量复位，从1开始报数
                    next = 1;

                  //  System.out.println("依次出列的人为："+(index+1));
                }else{
                    ++next;
                }
            }

            ++index;
            if(index == total){
                //数组下标复位，从0开始新重遍历
                index = 0;
            }
        }
        for(int i=0; i<total; i++){
            if(arr[i] == true){
                System.out.println(i+1);
            }
        }
    }

}
